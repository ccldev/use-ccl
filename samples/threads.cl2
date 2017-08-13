#include <Console>
#include <Thread>

def calcThread(){
	thread.waitFor("OutThread");
	for(0,100){
		var res = @.0 / 2;
		res = res * res;
		thread.write(
			"OutThread",
			"i" & integer(@.0).toString(),
			res);
//		thread.sleep(1000);
	}
}
def outThread(){
	for(0,100){
		var name = "i" & integer(@.0).toString();
		while({||return thread.find(name)!;}){
			//Wait for next result...
		}
		
		println(thread.read(name));
	}
}

Thread(calcThread, "CalcThread").start();
Thread(outThread, "OutThread").start();