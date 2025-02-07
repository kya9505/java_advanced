package day5.innerClass;

public class Creatur1 {
    private int life = 100;
    private class Animal{
        private String name = "Tiger";
        int getOuter(){
           return life;
        }
    }
    public void method(){
        Animal animal = new Animal();
        System.out.println(animal.name);
        System.out.println(animal.getOuter());
    }
}
