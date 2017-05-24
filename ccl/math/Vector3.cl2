def Vector3(x,y,z:0){
    
    var ret = [x:x,y:y,z:z];
    
    def add(a,b){
        Vector3(a.x + b.x, a.y + b.y, a.z + b.z)
    }
    def sub(a,b){
        Vector3(a.x - b.x, a.y - b.y, a.z - b.z)
    }
    def mul(a,b){
        if(b.type == "number"){
            Vector3(a.x * b, a.y * b, a.z * b)
        }
        Vector3(a.x * b.x, a.y * b.y, a.z * b.z)
    }
    
    ret.push(add.bind(ret), "add");
    ret.push(sub.bind(ret), "sub");
    ret.push(mul.bind(ret), "mul");
    
    ret
    
}