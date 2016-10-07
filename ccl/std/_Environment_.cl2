var natives = [
	Boolean: (java.lang.Boolean),
	Long: (java.lang.Long),
	Double: (java.lang.Double),
	Error: (ccl.vm.core.ErrorMarker)
];

var true = natives.Boolean.TRUE;
var false = natives.Boolean.FALSE;

def float(val){
	native(){
		G:Vval
		;:parse F
		R:~
	}
}
def integer(val){
	native(){
		G:Vval
		;:parse I
		R:~
	}
}
def boolean(val){
	native(){
		G:Vval
		;:parse B
		R:~
	}
}
def error(val){
	return natives.Error(val);
}