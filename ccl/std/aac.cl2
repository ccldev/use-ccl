def aac(outDir, compilerPath, classpath){
	(ccl.vm.core.bridge.JClassExpression).setOutputDirectory(
		(java.io.File)(outDir)
	);
	var enabled = (ccl.vm.core.bridge.codefactory.JClassFactory).getNormal().getField("enabled");
	enabled.set(undefined, true);
	
	(ccl.vm.core.bridge.codefactory.JCompiler).setCompiler(
		(ccl.vm.core.bridge.codefactory.DesktopJavaCompiler)(compilerPath)
	);
	
	var i = 0;
	while(i.lss(classpath.length())){
		println(classpath.get(i));
		i = i.add(1);
	}
}