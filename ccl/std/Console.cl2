var println,printf,print,read;
{
    var System = java("java.lang.System");
    var [!println,!printf,!print] = System.out;
    read = java("java.util.Scanner")(System.in).nextLine;
}