#include ccl/jui/XYChart.cl2

var SimpleChart;
{
	var NumAxis = JUI.chart("NumberAxis");
	
	def make(NumberAxis,x,y,to,from:0,type:"LineChart"){
		var chart = JUI.chart(type)(NumberAxis(),NumberAxis());
		chart.getData().add(XYSeries(x,y,from,to));
		chart
	}
	
	SimpleChart = make.bind(NumAxis);
}