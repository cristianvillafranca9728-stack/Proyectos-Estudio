@echo off
setlocal
if "%~1"=="" (
    echo Uso: run.cmd ClaseA^|ClaseB^|ContextoJuguete^|ContextoTransformer^|Metodos^|MetodosEstaticos
    exit /b 1
)
pushd "%~dp0"
javac -encoding UTF-8 -d build src\com\ebac\modulo39\*.java
if errorlevel 1 (
    popd
    exit /b 1
)
java -cp build com.ebac.modulo39.%~1
set "result=%errorlevel%"
popd
exit /b %result%