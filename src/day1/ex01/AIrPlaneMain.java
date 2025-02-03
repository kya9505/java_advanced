package day1.ex01;

public class AIrPlaneMain {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();
        airPlane.land();
        airPlane.fly();
        airPlane.takeOff();

        SuperAirPlane superAirPlane = new SuperAirPlane();
        superAirPlane.land();
        superAirPlane.fly();
        superAirPlane.takeOff();
        superAirPlane.flyMode = SuperAirPlane.ADVANCED; // 상수 호출 시 클래스명으로 접근
        superAirPlane.fly();

    }
}
