if not exist bin\nul md bin
javac -d bin -sourcepath src -cp bin src\by\itacademy\lesson06\calculator\Main.java
java -classpath bin by.itacademy.lesson06.calculator.Main