var println = undefined;
var read = undefined;

{
    var System = java("java.lang.System");
    
    println = System.out.println;
    print = System.out.print;
    printf = System.out.printf;
    
    read = java("java.util.Scanner")(System.in).nextLine;
}