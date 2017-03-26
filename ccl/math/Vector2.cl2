def Vector2(x,y){
    
    var this = [x:x,y:y];
    
    def add(b){
        return Vector2(this.x + b.x, this.y + b.y);
    }
    def sub(b){
        return Vector2(this.x - b.x, this.y - b.y);
    }
    def mul(b){
        if(b.type == "number"){
            return Vector2(this.x * b, this.y * b);
        }
        return Vector2(this.x * b.x, this.y * b.y);
    }
    
    this.push(add, "add");
    this.push(sub, "sub");
    this.push(mul, "mul");
    
    return this;
    
}