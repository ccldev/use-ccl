#include ccl/std/Console.cl2
#include ccl/std/struct.cl2

var Name = struct(["firstName", "lastName"]);

var persons = [
    hans: Name("Hans", "Müller"),
    susi: Name("Susi", "Müller")
];

println("Type a name!");
var lookup = persons(read().toLowerCase());

println(lookup);