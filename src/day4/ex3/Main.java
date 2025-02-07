package day4.ex3;

public class Main {
    public static void main(String[] args) {
        ABCImple abcImple = new ABCImple();

        InterfaceA ia = abcImple;
        ia.merhodA();

        InterfaceB ib =abcImple;
        ib.merhodB();

        InterfaceC ic = abcImple;
        ic.merhodC();
        ic.merhodA();
        ic.merhodB();
    }
}
