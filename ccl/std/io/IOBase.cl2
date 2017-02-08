def IOBase(this){
	
	def downloadFrom(this, downloadFromUrl){
		return this.writer().for(downloadFromUrl.stream());
	}
	
	def stream(this, filter:<v|v>){
		var streamReader = this.reader();
		if(streamReader.type == "error"){
			return streamReader;
		}
		var i;
		var r = [];
		while(true){
			i = streamReader();
			if(i < 0 - 1){
				r.push(filter(i));
			}else{
				if(i < 0){
					return r;
				}
				r.push(filter(i));
			}
		}
	}
	
	def writeString(this, rawString, format:"ASCII"){
		this.writer().for(array(rawString.getBytes(format)));
		return this;
	}
	
	def writeFormattedString(this, format, rawString){
		return this.writeString(rawString, format);
	}
	
	def buildString(this, format:"ASCII"){
		return java("java.lang.String")(byte.for(this.stream()), format);
	}
	
	this.push(downloadFrom.bind(this), "downloadFrom");
	this.push(stream.bind(this), "stream");
	this.push(writeString.bind(this), "writeString");
	this.push(buildString.bind(this), "buildString");
	this.push(writeFormattedString.bind(this), "writeFormattedString");
	
}