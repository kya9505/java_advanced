package day1.ex01;

public class SuperAirPlane extends AirPlane{
    //상수선언
    public static final int NOMAL = 1;
    public static final int ADVANCED = 2;

    //상태 필드 선언
    public int flyMode = NOMAL;

    @Override
    public void fly() {
        if(flyMode == ADVANCED) System.out.println("초음속비행");
        else super.fly();
    }
}
