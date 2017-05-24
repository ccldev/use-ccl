var parameters = @;var App=parameters.getOrDefault(0,undefined);

var func=parameters.getOrDefault(1,undefined);

var args=parameters.getOrDefault(2,[]);


def startFunc(old, stage){
var dnd = java("io.github.coalangsoft.dragdropfx.DragDropFX");
if(dnd.type.equals("error")!){
stage.setProperty("DnD", dnd());
}
old(stage);
}

App(startFunc.bind(func)).launch(args);
