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
	
	//Image
	def image(name){
		return java("javafx.scene.image.".concat(name));
	}
	image = new.bind(image._, []);
	
	//Media
	def media(name){
		return java("javafx.scene.media.".concat(name));
	}
	media = new.bind(media._, []);
	
	def EventHandler(clss, func){
		return clss([
			handle:func
		]);
	}
	
	JUI = [
		layout:layout,
		control:control,
		search:search,
		media:media,
		image:image,
		Scene:java("javafx.scene.Scene"),
		EventHandler:EventHandler.bind(java("javafx.event.EventHandler")),
		FileChooser:java("javafx.stage.FileChooser"),
		FileChooser:java("javafx.scene.text.Font")
	];
}