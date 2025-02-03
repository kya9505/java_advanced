package day1.inh;

public class CarMain {
    public static void main(String[] args) {

        Car mycar = new Car();

        mycar.tire = new Tire();
        mycar.run();

        mycar.tire = new HankookTire();
        mycar.run();

        mycar.tire = new KumhoTire();
        mycar.run();
    }
}
