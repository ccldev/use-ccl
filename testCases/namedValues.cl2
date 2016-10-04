#include ccl/std/Console.cl2

var array = [
    home: "123/456",
    other: "321/654"
];

def func(val){
    println(val.home);
    println(val.get(0));
}

func(array);