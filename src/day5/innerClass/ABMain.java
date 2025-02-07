package day5.innerClass;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();

        a.useB();
    }
}
