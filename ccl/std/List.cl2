def List(data){
    
    def op(op,a,b){
        if(b.LIST_INFO.type == "boolean"){
            return a[op](b.data);
        }else{
            if(a.data.length() == b.length()){
                var arr = <op,dex|a.data.get(dex)[op](b.get(dex))>.bind(op).for(0,b.length() - 1);
                return List(arr);
            }
        }
    }
    
    var ret = [LIST_INFO:true, data:data];
    ret.push(op.bind("add", ret), "add");
    ret.push(op.bind("sub", ret), "sub");
    ret.push(op.bind("mul", ret), "mul");
    ret.push(op.bind("div", ret), "div");
    return ret;
}