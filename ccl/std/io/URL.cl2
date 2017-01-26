#include <io/IOBase>

def URL(rawUrl){
	var ret = [java:java("java.net.URL")(rawUrl)];
	
	def reader(this){
		return this.java.openStream().read;
	}
	
	ret.push(reader.bind(ret), "reader");
	
	return ret;
}

URL = URL.extend(IOBase);