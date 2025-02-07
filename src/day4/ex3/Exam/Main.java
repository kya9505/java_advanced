package day4.ex3.Exam;

public class Main {
    public static void action(A a){
       if(a instanceof C c){
           c.method2();
       }else a.method1();
    }

    public static void main(String[] args) {
        A ab = new B();
        A ac = new C();

        action(ab);
        action(ac);
    }
}
