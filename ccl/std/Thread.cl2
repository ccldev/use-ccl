var Thread;
{
	var r = java("java.lang.Runnable");
	var t = java("java.lang.Thread");
	
	def T(f,name){
		var ret = t(
			r([
				run:f
			])
		);
		ret.setName(name);
		[
			start:ret.start
		]
	}
	
	Thread = T;
}