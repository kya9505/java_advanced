package day1.ex01;

public class CarMain {
    public static void main(String[] args) {
        Car mycar1 = new Car();
        mycar1.speedUp();
        mycar1.speedUp();
        mycar1.speedUp();
        System.out.println(mycar1.toString());

        SportsCar mycar2 = new SportsCar();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        System.out.println(mycar2.toString());

    }
}
