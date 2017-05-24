var JUI;

{
	
	def new(old, defaults, name){
		var ret = defaults[name];
		if(ret.type == "error"){
			ret = old(name);
			defaults.push(ret, name);
			ret
		}
		ret
	}
	
	//Layout
	def layout(name){
		java("javafx.scene.layout.".concat(name))
	}
	layout = new.bind(layout._, []);
	
	
	//Control
	def control(name){
		java("javafx.scene.control.".concat(name))
	}
	control = new.bind(control._, []);
	
	//Search
	def search(name){
		java("io.github.coalangsoft.jsearchfx.ui.".concat(name))
	}
	search = new.bind(search._, []);
	
	//Image
	def image(name){
		java("javafx.scene.image.".concat(name))
	}
	image = new.bind(image._, []);
	
	//Media
	def media(name){
		java("javafx.scene.media.".concat(name))
	}
	media = new.bind(media._, []);
	
	def EventHandler(clss, func){
		clss([
			handle:func
		])
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
		Font:java("javafx.scene.text.Font")
	];
}