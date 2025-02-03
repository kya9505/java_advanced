package day1;

public class Car {
    int Speed;

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    final void stop(){
         System.out.println("차를 멈춤");
         setSpeed(0);
    }

    public void speedUp(){
         setSpeed(getSpeed()+1);
    }
}
