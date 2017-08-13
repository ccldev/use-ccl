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