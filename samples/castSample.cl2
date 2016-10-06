#include ccl/std/Console.cl2
#include ccl/std/_Environment_.cl2

println("Expected\: integer, float, false, boolean");

println(integer("14").type);
println(float("12.34").type);
println(boolean("ljöhn"));
println(boolean("true").type);