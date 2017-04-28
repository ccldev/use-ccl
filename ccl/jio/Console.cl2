#include ccl/jio/Stream.cl2

var stdin,stdout;
var println,printf,print,read;
{
    var System = java("java.lang.System");

    var [in,out] = System;

    stdin = Stream(in);
    stdout = Stream(out);

    var [!println,!printf,!print] = out;
    read = java("java.util.Scanner")(in).nextLine;
}