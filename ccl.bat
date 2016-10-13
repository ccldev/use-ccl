java -jar ccl0.2.10.jar -compile %1
if errorlevel 1 goto end
set fname=%1
set fname=%fname:~0,-1%0
java -jar ccl0.2.10.jar %fname%
if errorlevel 1 goto end

:end
pause