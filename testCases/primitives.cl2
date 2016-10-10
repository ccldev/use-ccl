#include ccl/std/Console.cl2
#defop + add

var point = (java.awt.Point)(1,2);

println(point.x + point.y);

def pointAdder(a,b){
    return (java.awt.Point)(a.x + b.x, a.y + b.y);
}

point.intern.setProperty("add", pointAdder.bind(point).intern);

println(point + point);

var dimension = (java.awt.Dimension)(800,600);
println("Following output should be ccl.vm.expr.FloatExpression");
println(dimension.getWidth().intern.getClass().getName());