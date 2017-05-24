
def launch(App, func, args:[]){

def startFunc(old, stage){
var dnd = java("io.github.coalangsoft.dragdropfx.DragDropFX");
if(dnd.type.equals("error")!){
stage.setProperty("DnD", dnd());
}
old(stage);
}

App(startFunc.bind(func)).launch(args);
}

return [
launch:launch.bind(java("javafx.application.Application"))
];
