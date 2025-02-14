package day10.Lamda.calculator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.calculate((a,b)->{
            double result = a +b;
            return result;
        });

        person.calculate((a,b)->sum(a,b));
    }

    public static double sum(double a, double b){
        return (a+b);
    }
}
