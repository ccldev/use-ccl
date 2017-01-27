#include <io/IOBase>

def File(filePath){
	
	var ret = [java:java("java.io.File")(filePath)];
	
	def writer(this){
		return java("java.io.FileOutputStream")(this.java).write;
	}
	
	def reader(this){
		return java("java.io.FileInputStream")(this.java).read;
	}
	
	ret.push(writer.bind(ret), "writer");
	ret.push(reader.bind(ret), "reader");
	ret.push(ret.java.exists, "exists");
	
	return ret;
	
}

File = File._.extend(IOBase._);