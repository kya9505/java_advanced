package day1.Vehicle;

public class Vehicle {
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle{
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

class Driver{
    public void drive(Vehicle vehicle){
        Object obj = vehicle;
        Vehicle v =(Vehicle)obj;
        vehicle.run();
    }
}

class DriveMain{
    public static void main(String[] args) {

        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}