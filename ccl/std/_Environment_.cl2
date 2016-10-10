var natives = [
	Error: (ccl.vm.core.ErrorMarker)
];

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