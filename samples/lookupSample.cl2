#include ccl/std/Console.cl2
#include ccl/std/struct.cl2

var Name = struct(["firstName", "lastName"]);

var persons = [
    hans: Name("Hans", "Müller"),
    susi: Name("Susi", "Müller")
];

println("Type a name!");
var lookup = persons.property(read().toLowerCase());

println(lookup);