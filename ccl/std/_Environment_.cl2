var natives = [
	Boolean: (java.lang.Boolean),
	Long: (java.lang.Long),
	Double: (java.lang.Double)
];

var true = natives.Boolean.TRUE;
var false = natives.Boolean.FALSE;

def float(val){
	return natives.Double.parseDouble(val.toString());
}
def integer(val){
	return natives.Long.parseLong(val.toString());
}
def boolean(val){
	return natives.Boolean.parseBoolean(val.toString());
}