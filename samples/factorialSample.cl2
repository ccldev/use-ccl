#include <Console>

def factorial(i){
    if(i){
        return 1;
    }
    return i * factorial(i - 1);
}

println(factorial(6));
