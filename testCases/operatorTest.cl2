#include ccl/math/Vector2.cl2
#include ccl/std/Console.cl2
#include ccl/std/ops.cl2

var vec1 = Vector2(1,5);
var vec2 = Vector2(6,8);

println("Expect\: 7;13");
println(vec1 + vec2);

println("Expect\: -5;-3");
println(vec1 - vec2);

println("Expect\: 6;40");
println(vec1 * vec2);