#include <io/IOBase>

def URL(rawUrl){
	var this = [java:java("java.net.URL")(rawUrl)];
	
	def reader(){
		return this.java.openStream().read;
	}
	
	this.push(reader, "reader");
	
	return this;
}

URL = URL.extend(IOBase);