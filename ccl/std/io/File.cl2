#include <io/IOBase>

def File(filePath){
	
	var ret = [java:java("java.io.File")(filePath)];
	
	def writer(this){
		return java("java.io.FileOutputStream")(this.java).write;
	}
	
	def reader(this){
		return java("java.io.FileInputStream")(this.java).read;
	}
	
	def toUrl(this){
		return this.java.toURI().toURL().toExternalForm();
	}
	
	ret.push(writer.bind(ret), "writer");
	ret.push(reader.bind(ret), "reader");
	ret.push(ret.java.exists, "exists");
	ret.push(ret.java.getName, "getName");
	ret.push(toUrl.bind(ret), "toUrl");
	
	return ret;
	
}

File = File._.extend(IOBase._);