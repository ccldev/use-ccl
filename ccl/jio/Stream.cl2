def Stream(javaStream){
	return [
		read:<|javaStream.read>,
		write:<|javaStream.write>
	];
}