#include <io/IOBase>

def String(){
	var ret = [list:[], index:0];
	
	def writer(this){
		return this.list.push;
	}
	
	def charAt(this){
		var d = this.list[this.index];
		if(d._.type == "error"){
			return integer("-1");
		}else{
			return d._;
		}
	}
	
	def rf(this){
		var c = char2int(
			this.charAt(this.index)
		);
		if(c._ < 0){
			return integer("-1");
		}else{
			this.setProperty("index", this.index + 1);
		}
		return c._;
	}
	
	def reader(rf, this){
		return rf.bind(this._);
	}
	
	ret.push(writer.bind(ret), "writer");
	ret.push(charAt.bind(ret), "charAt");
	ret.push(reader.bind(rf._, ret), "reader");
	
	return ret._;
}

String = String._.extend(IOBase._);

{
	def StringExtension(this, rawString){
		if(rawString.type == "string"){
			this.append(rawString);
		}
	}
	String = String._.extend(StringExtension._);
}