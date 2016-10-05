def struct(array){
	
	def retFunc(args){
		
		var ret = [];
		
		var i = 0;
		while(i.lss(args.length())){
			ret.push(parameters.get(i.add(1)), args.get(i));
			i = i.add(1);
		}
		
		return ret;
		
	}
	
	return retFunc.bind(array);
    
}