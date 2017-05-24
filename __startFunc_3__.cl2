var parameters = @;var old=parameters.getOrDefault(0,undefined);

var stage=parameters.getOrDefault(1,undefined);


var dnd = java("io.github.coalangsoft.dragdropfx.DragDropFX");
if(dnd.type.equals("error")!){
stage.setProperty("DnD", dnd());
}
old(stage);
