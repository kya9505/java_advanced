package day2.abstractinher;

public non-sealed class Manager extends Person {

    @Override
    public void work() {
        System.out.println("생산을 관리합니다.");
    }
}
