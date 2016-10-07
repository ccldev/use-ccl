#include ccl/std/Console.cl2

def errorOnUndefined(arg){
    if(arg == undefined){
        throw "Error\: parameter 'arg' is undefined!";
    }
    println(arg);
}

errorOnUndefined("Should work");
println("Error message expected!");
errorOnUndefined();