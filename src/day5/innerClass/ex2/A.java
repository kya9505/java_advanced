package day5.innerClass.ex2;

public class A {


    void useB(int param){
        int value =1;

        class B{
            int field1 = 10;
            static int field2 = 10;

            public B() {
                System.out.println("생성자");
            }

            void method1(){
                System.out.println("B method1");
//                System.out.println("원본 field1 값 : "+field1);
//                field1 = 30;
//                System.out.println("new field1 값 : "+field1);
                System.out.println("param : "+param);
                System.out.println("value : "+value);

            }
            static void method2(){
                System.out.println("B static method2");
            }
        }

        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}

class AMain{
    public static void main(String[] args) {
        A a = new A();
        a.useB(50);
    }
}
