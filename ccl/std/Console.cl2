var println = 0;
var read = 0;

{
var System = java("java.lang.System");
println = System.out.println;
read = java("java.util.Scanner")(System.in).nextLine;
}