def Vector2(x,y){
    
    var ret = [x:x,y:y];
    
    def add(a,b){
        return Vector2(a.x + b.x, a.y + b.y);
    }
    def sub(a,b){
        return Vector2(a.x - b.x, a.y - b.y);
    }
    def mul(a,b){
        if(b.type == "number"){
            return Vector2(a.x * b, a.y * b);
        }
        return Vector2(a.x * b.x, a.y * b.y);
    }
    
    ret.push(add.bind(ret), "add");
    ret.push(sub.bind(ret), "sub");
    ret.push(mul.bind(ret), "mul");
    
    return ret;
    
}