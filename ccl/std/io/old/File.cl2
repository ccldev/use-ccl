#include <io/IOBase>

def File(filePath){

	var this = [java:java("java.io.File")(filePath)];

	def writer(){
		java("java.io.FileOutputStream")(this.java).write
	}

	def reader(){
		java("java.io.FileInputStream")(this.java).read
	}

	def toUrl(){
		this.java.toURI().toURL().toExternalForm()
	}

	this.push(writer, "writer");
	this.push(reader, "reader");
	this.push(this.java.exists, "exists");
	this.push(this.java.getName, "getName");
	this.push(toUrl, "toUrl");
	this.push(<j|j.getParent().equals(j)!>.bind(this.java), "hasParent");
	this.push(<j|File(j.getParent())>.bind(this.java), "getParent");
	this.push(this.java.mkdirs, "createDirectory");
	this.push(this.java.createNewFile, "createFile");

	this;

}

File = File.extend(IOBase);