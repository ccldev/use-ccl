#include <Console>
#include <Thread>

def calcThread(){
	thread.waitFor("OutThread");
	var i = 0;
	while(i < 100){
		var res = i / 2;
		res = res * res;
		thread.write(
			"OutThread",
			"i".concat(integer(i).toString()),
			res);
//		thread.sleep(1000);
		i = i + 1;
	}
}
def outThread(){
	var i = 0;
	while(i < 100){
		var name = "i".concat(integer(i).toString());
		while(thread.find(name)!){
			//Wait for next result...
		}
		
		println(thread.read(name));
		
		i = i + 1;
	}
}

Thread(calcThread, "CalcThread").start();
Thread(outThread, "OutThread").start();