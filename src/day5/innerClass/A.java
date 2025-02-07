package day5.innerClass;

public class A {

    class B{
        int field1 = 10;
        static  int field2 = 20;
        B(){
            System.out.println("B의 생성자 실행");
        }
        void method1(){
            System.out.println("B의 method1실행");
        }
        static void method2(){
            System.out.println("B의 static method2실행");
        }

    }
    void useB(){
        B b = new B();
        System.out.println(b.field1);
        b.method1();
        System.out.println("B정적 필드와 정적 메소드");
        System.out.println(B.field2);
        B.method2();



    }

    B field = new B();

    A(){
        B b = new B();
    }
}
