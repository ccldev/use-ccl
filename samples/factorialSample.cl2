#include <Console>
#include <syntax/shortDef>

def factorial(arg) = <x|x>.for(1,arg).push(1)*;

println(factorial(6));