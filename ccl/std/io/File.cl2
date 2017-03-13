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
    ret.push(ret.java.getPath, "getPath");
    ret.push(ret.java.getAbsolutePath, "getAbsolutePath");
	ret.push(toUrl.bind(ret), "toUrl");
	ret.push(<j|j.getParent().equals(j)!>.bind(ret.java), "hasParent");
	ret.push(<j|File(j.getParent())>.bind(ret.java), "getParent");
	ret.push(ret.java.mkdirs, "createDirectory");
	ret.push(ret.java.createNewFile, "createFile");
    ret.push(<j|File.for(array(j.list()))>.bind(ret.java), "list");
	
	return ret;
	
}

File = File._.extend(IOBase._);