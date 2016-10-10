def aac(cp:[],javac:"javac",out:"_out_"){
	
	var i = 0;
	while(i < cp.length()){
		(ccl.vm.core.bridge.javac.JavaC).globalClasspath.add(
			(java.io.File)(cp.get(i))
		);
		i = i + 1;
	}
	
	(ccl.vm.core.bridge.JClassExpression).setOutputDirectory(
		(java.io.File)(out)
	);
	(ccl.vm.core.bridge.codefactory.JClassFactory).enabled._set_(true);
	(ccl.vm.core.bridge.codefactory.JCompiler).setCompiler(
		(ccl.vm.core.bridge.codefactory.DesktopJavaCompiler)(javac)
	);
}