#include <io/IOBase>

def URL(rawUrl){
	var this = [java:java("java.net.URL")(rawUrl)];

	def reader(){
	    this.java.openStream().read
	}

	this.push(reader, "reader");

	this
}

URL = URL.extend(IOBase);