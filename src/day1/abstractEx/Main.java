package day1.abstractEx;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        animalSound(dog);
        animalSound(cat);

    }

    public static void animalSound(Animal animal){
       if(animal instanceof Cat)
        animal.sound();
    }
}
