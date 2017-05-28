#include ccl/jio/Stream.cl2

var stdin,stdout;
var println,printf,print,read;
{
    var System = java("java.lang.System");

    var in = System.in;
    var out = System.out;

    stdin = Stream(in);
    stdout = Stream(out);

    println = out.println;
    printf = out.printf;
    print = out.print;

    read = java("java.util.Scanner")(in).nextLine;
}