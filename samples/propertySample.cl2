#include ccl/std/Console.cl2
#include ccl/std/struct.cl2

var Number = struct([
	"vorwahl",
	"haupt"
]);

var num = Number("12345", "67890");
var props = num.properties;

var i = 0;
while(i < props.length()){
	var toGet = props.get(i);
	var value = num(toGet);
	println((java.lang.String).valueOf(toGet).concat("\:\t").concat((java.lang.String).valueOf(value)));
	i = i + 1;
}