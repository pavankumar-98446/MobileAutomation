echo off
taskkill /F /IM chrome* /T

cd /D %temp%
for /d %%D in (*) do rd /s /q "%%D"
del /f /q *

rd /s /q %systemdrive%\$RECYCLE.BIN

exit