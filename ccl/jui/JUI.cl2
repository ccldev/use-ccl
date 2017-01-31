var JUI;

{
	
	def new(old, defaults, name){
		var ret = defaults[name];
		if(ret.type == "error"){
			ret = old(name);
			defaults.push(ret, name);
			return ret;
		}
		return ret;
	}
	
	//Layout
	def layout(name){
		return java("javafx.scene.layout.".concat(name));
	}
	
	layout = new.bind(layout._, []);
	
	
	//Control
	def control(name){
		return java("javafx.scene.control.".concat(name));
	}
	
	control = new.bind(control._, []);
	
	//Search
	def search(name){
		return java("io.github.coalangsoft.jsearchfx.ui.".concat(name));
	}
	
	search = new.bind(search._, []);
	
	def EventHandler(clss, func){
		return clss([
			handle:func
		]);
	}
	
	JUI = [
		layout:layout,
		control:control,
		search:search,
		Scene:java("javafx.scene.Scene"),
		EventHandler:EventHandler.bind(java("javafx.event.EventHandler"))
	];
}