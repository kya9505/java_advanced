package day3.InterfaceAnimal;

public abstract class Animal {

    private int speed;
    private double distance;
    private int hours;

    public Animal(int speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
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
    public abstract void run(int hours); //이동거리 측정
}
