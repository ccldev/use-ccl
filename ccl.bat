java -jar ccl0.3.20.jar -compile %1 -plugins plugins -head on
if errorlevel 1 goto end
set fname=%1
set fname=%fname:~0,-1%0
java -jar ccl0.3.20.jar %fname%
if errorlevel 1 goto end

:end
pause