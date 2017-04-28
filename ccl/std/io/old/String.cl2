#include <io/IOBase>

def String(){
	var this = [list:[], index:0];

	def writer(){
		return this.list.push;
	}

	def charAt(index){
		var d = this.list[index];
		if(d.type == "error"){
			return -1;
		}else{
			return d;
		}
	}

	def rf(){
		if(this.list.length() == this.index){
			return -1;
		}
		var c = char2int(
			this.charAt(this.index)
		);
		this.setProperty("index", this.index + 1);
		return c;
	}

	def reader(){
		return rf;
	}

	this.push(writer, "writer");
	this.push(charAt, "charAt");
	this.push(reader, "reader");

	return this;
}

String = String.extend(IOBase);

{
	def StringExtension(this, rawString){
		if(rawString.type == "string"){
			this.writeString(rawString);
		}
	}
	String = String.extend(StringExtension);
}