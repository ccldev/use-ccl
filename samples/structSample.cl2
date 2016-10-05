#include ccl/std/Console.cl2
#include ccl/std/struct.cl2

var Person = struct([
    "firstName",
    "lastName",
    "age"
]);

var hans = Person("Hans", "Müller", 30);

println.for(hans);
println(hans.lastName);