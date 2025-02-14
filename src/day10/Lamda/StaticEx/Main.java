package day10.Lamda.StaticEx;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.calculate(Computer::staticMethod1);
        Computer computer = new Computer();
        person.calculate(Computer::staticMethod2);
    }
}
