#include ccl/jui/Chart.cl2

var XYChart = JUI.chart("XYChart");
var XYSeries;
{
	def Series(jSeries,jData,fx,fy,start,stop,name:""){
		var xData = fx.for(start,stop);
		var yData = fy.for(start,stop);
		
		def makeSeries(jSeries, jData, name, xd, yd){
			var s = jSeries();
			s.setName(name);
			<i|s.getData().add(jData(xd[i], yd[i]))>
				.for(0,xd.length()-1);
			return s;
		}
		
		return makeSeries(jSeries,jData,name,xData,yData);
	}
	XYSeries = Series.bind(XYChart.Series, XYChart.Data);
}