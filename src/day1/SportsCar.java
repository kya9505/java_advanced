package day1;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        setSpeed(getSpeed()+10);
    }
}
