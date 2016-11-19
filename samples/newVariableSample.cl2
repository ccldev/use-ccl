#include ccl/std/Console.cl2

//Normal variable
var a = 1;

println("Expected: 1; 1; undefined; 1");

println(a);
{
    println(a);
    
    //Empty variable, same as var a = undefined;
    var a;
    println(a);
    
}
println(a);

//Read properties (e.g. from array):
var [
    a,
    d
] = [a:1, b:2, c:4, d:8, e:16];

println("Expected: 1; 8");

println(a);
println(d);

//Custom names:
var [varName:a, var2:b, c] = [a:9, b:8, c:7];

println("Expected: 9; 8; 7");

println(varName);
println(var2);
println(c);