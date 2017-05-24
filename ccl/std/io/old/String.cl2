#include <io/IOBase>

def String(){
	var this = [list:[], index:0];

	def writer(){
		this.list.push
	}

	def charAt(index){
		var d = this.list[index];
		if(d.type == "error"){
			-1
		}else{
			d
		}
	}

	def rf(){
		if(this.list.length() == this.index){
			-1
		}
		var c = char2int(
			this.charAt(this.index)
		);
		this.setProperty("index", this.index + 1);
		c
	}

	def reader(){
		rf
	}

	this.push(writer, "writer");
	this.push(charAt, "charAt");
	this.push(reader, "reader");

	this
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