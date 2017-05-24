var parameters = @;var b=parameters.getOrDefault(0,undefined);


if(b.type == "number"){
Vector2(this.x * b, this.y * b)
}
Vector2(this.x * b.x, this.y * b.y)
