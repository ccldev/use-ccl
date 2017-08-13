#include ccl/std/Console.cl2
#include ccl/std/struct.cl2

var Number = struct([
	"vorwahl",
	"haupt"
]);

var num = Number("12345", "67890");
var props = num.properties;
var String = java("java.lang.String");

for(0,props.length() - 1){
	var toGet = props.get(@.0);
	var value = num[toGet];
	println(String.valueOf(toGet) & ":\t" & String.valueOf(value));
}