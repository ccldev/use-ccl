java -jar ccl0.3.2.jar -compile %1
if errorlevel 1 goto end
set fname=%1
set fname=%fname:~0,-1%0
java -jar ccl0.3.2.jar %fname%
if errorlevel 1 goto end

:end
pause