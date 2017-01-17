def IOBase(this){
	
	def downloadFrom(this, downloadFromUrl){
		return this.writer().for(downloadFromUrl.stream());
	}
	
	def stream(this){
		var streamReader = this.reader();
		if(streamReader._.type == "error"){
			return streamReader._;
		}
		var i;
		var r = [];
		while(true){
			i = streamReader._();
			if(i._ < 0){
				return r._;
			}
			r._.push(i._);
		}
	}
	
	def writeString(this, rawString){
		this.writer().for(char2int.for(array(rawString.toCharArray())));
	}
	
	this.push(downloadFrom.bind(this), "downloadFrom");
	this.push(stream.bind(this), "stream");
	this.push(writeString.bind(this), "writeString");
	
}