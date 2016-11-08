#include ccl/std/Console.cl2

var point = java("java.awt.Point")(1,2);

println(point.x + point.y);

var dimension = java("java.awt.Dimension")(800,600);
println("Following output should be number");
println(dimension.getWidth().type);