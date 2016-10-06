#include ccl/std/Console.cl2

println("Expected\: error output.");

var working = 1.add(5);
if(working.type == "error"){
    println("UNEXPECTED!!!!");
}

var err = undefined.someProperty;
if(err.type == "error"){
    println("EXPECTED \:)");
    println(err.data);
}