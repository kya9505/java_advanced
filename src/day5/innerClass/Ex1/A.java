package day5.innerClass.Ex1;

public class A {
    static class B{}

    B field = new B();
    static B field2 = new B();

    A(){
        B b = new B();
    }

    void method1(){
        B b = new B();
    }
    static void method2(){
        B b = new B();
    }
}

