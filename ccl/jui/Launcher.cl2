def Launcher(){
	var App = java("ccl.lib.ui.App");
	var Launch = java("ccl.lib.ui.Launch");
	
	def launch(Launch, App, func, args:[]){
		Launch.launch(App([
			start:func
		]), args);
	}
	
	return [
		launch:launch.bind(Launch, App)
	];
}