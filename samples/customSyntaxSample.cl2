#unsafe
#include <Console>
#include <syntax/batch>
#snippet echo\s*(.*) println(%s);

var i = 0;

:start;

echo "Wuhu, Loop!!";

i = i + 1;
if(i > 100){
    goto end;
}

goto start;

:end;