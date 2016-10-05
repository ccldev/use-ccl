var io = [];

{
	
	def File(name){
		return [
			name:name,
			writer:io.FileWriter.bind(name)
		];
	}
	
	def FileWriter(name){
		var stream = (java.io.FileOutputStream)((java.io.File)(name));
		var print = (java.io.PrintStream)(stream);
		
		return [
			write:print.print,
			writeln:print.println
		];
	}
	
	io = [
		File:File,
		FileWriter:FileWriter
	];
	
}