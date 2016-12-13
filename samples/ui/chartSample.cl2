#include ccl/jui/Launcher.cl2
#include ccl/jui/SimpleChart.cl2

def start(stage){	
	stage.setScene(JUI.Scene(
		SimpleChart(<x|x>,<y|y*y>,100)
	));
	stage.show();
}

Launcher().launch(start, []);