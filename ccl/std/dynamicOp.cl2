def op(n){return <x,y|x[n](y)>;}

var (add,sub,mul,div,mod,pow,lss,gtr,equals,not,nvp,concat) = op.for([
	"add","sub","mul","div","mod","pow","lss","gtr","equals","not","nvp","concat"
]);