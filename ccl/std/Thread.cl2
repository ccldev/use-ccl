var Thread;
{
	var runnable = java("java.lang.Runnable");
	var t = java("java.lang.Thread");
	
	def T(r,t,f,name){
		var ret = t(
			r([
				run:f._
			])
		);
		ret.setName(name);
		return [
			start:ret.start
		];
	}
	
	Thread = T.bind(runnable,t);
}