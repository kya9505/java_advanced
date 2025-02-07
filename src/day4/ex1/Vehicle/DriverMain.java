package day4.ex1.Vehicle;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive();

        driver.vehicle = new Taxi();
        driver.drive();

        driver.vehicle = new Hourse();
        driver.drive();
//
//        Bus bus = new Bus();
//        driver.drive(bus);
//
//        Taxi taxi = new Taxi();
//        driver.drive(taxi);
//        Hourse hourse = new Hourse();
        //driver.drive(hourse);
    }
}
