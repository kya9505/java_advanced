package day10.Lamda.StaticEx;

import day10.Lamda.calculator.Calcuable;

public class Person {

    private double a;
    private double b;


    public void setA(double a) {
        this.a = a;
    }


    public void setB(double b) {
        this.b = b;
    }

    public void calculate(Calcuable calcuable){
        double result = calcuable.calculate(this.a,this.b);
        System.out.println("결과 : " + result);
    }

}
