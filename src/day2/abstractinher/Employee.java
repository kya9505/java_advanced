package day2.abstractinher;

public final class Employee extends Person {
    @Override
    public void work() {
        System.out.println("생산을 합니다.");
    }
}
