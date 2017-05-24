#include ccl/jui/JUI.cl2
{
	def chart(name){
		java("javafx.scene.chart.".concat(name))
	}
	JUI.setProperty("chart", chart);
}