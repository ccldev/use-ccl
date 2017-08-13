java -jar coa0.5.8.2.jar -compile %1 -lib F:\Info\Java\NewWorkspace\CCL\CclStandardLib
if errorlevel 1 echo Warning: Compile problem
set fname=%1
set fname=./%fname:~0,-1%0
echo %fname%
java -jar coa0.5.8.2.jar %fname%
if errorlevel 1 goto end

:end
pause