def Launcher(){
	def launch(App, func, args:[]){
		App(func).launch(args);
	}
	
	return [
		launch:launch.bind(java("javafx.application.Application"))
	];
}