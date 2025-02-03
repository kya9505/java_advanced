package day1;

public class CarMain {
    public static void main(String[] args) {
        Car mycar1 = new Car();
        mycar1.setSpeed(3);
        System.out.println(mycar1.getSpeed());

        SportsCar mycar2 = new SportsCar();
        mycar2.setSpeed(50);
        System.out.println(mycar2.getSpeed());

    }
}
