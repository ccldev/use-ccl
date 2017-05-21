#include <Console>

def factorial(i){
    if(i){
        1
    }else{
        i * factorial(i - 1)
    }
}

println(factorial(6));
