package day3.InterfaceAnimal;

public class Chicken extends Animal implements Cheatable{
    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        setDistance(getSpeed()*hours);
        System.out.printf("닭의 이동거리 = %.1f\n",getDistance());
    }

    @Override
    public void fly() {
        setDistance(getSpeed()*2*this.getHours());
        System.out.printf("날으는 닭의 이동거리 = %.1f\n",getDistance());
    }

}
