#include ccl/std/Console.cl2

def normal(a,b){
    println(b);
    println(a);
}

def withDefaults(a:"wer immer du bist.",b:"Hallo "){
    println(b);
    println(a);
}

normal();
normal(1);
normal(1,2);

withDefaults();
withDefaults("Hans");
withDefaults("Susi", "Hi ");