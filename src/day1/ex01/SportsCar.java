package day1.ex01;

public class SportsCar extends Car{
    @Override
    public String toString() {
        return "현재 스피드는 " + this.Speed;

                    }

    @Override
    public void speedUp() {
        this.Speed += 10 ;
    }
}
