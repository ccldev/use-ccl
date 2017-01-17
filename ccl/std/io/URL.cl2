#include <io/IOBase>

def URL(rawUrl){
	var ret = [java:java("java.net.URL")(rawUrl)];
	
	def reader(this){
		return this.java.openStream().read;
	}
	
	ret._.push(reader._.bind(ret._), "reader");
	
	return ret._;
}

URL = URL._.extend(IOBase._);