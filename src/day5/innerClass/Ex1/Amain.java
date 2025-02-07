package day5.innerClass.Ex1;

public class Amain{
    public static void main(String[] args) {
        A.B b = new A.B();
        A a = new A();
        a.method1();


        A.method2();
        System.out.println(A.field2); //B클래스 타입의 메서드나 필드여도 static이라면 A클래스를 통해 호출가능

    }
}
