def struct(array){
	
	def retFunc(){
		
		var ret = [];
		
		var i = 0;
		while(i.lss(array.length())){
			ret.push(parameters.get(i), array.get(i));
			i = i.add(1);
		}
		
		return ret;
		
	}
	
	return retFunc;
    
}