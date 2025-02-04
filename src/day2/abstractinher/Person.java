package day2.abstractinher;

public sealed class Person permits Employee, Manager {
    public void work(){
        System.out.println("일을 합니다.");
    }
}
