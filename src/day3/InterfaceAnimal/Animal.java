package day3.InterfaceAnimal;

public abstract class Animal {
    private int speed;
    private static double distance;
    int hours;

    public Animal(int speed) {
        this.speed = speed;
    }

    public static void setDistance(double distance) {
        Animal.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public abstract void run(int hours);
}
