package day1.TV;

public class Main {
    public static void main(String[] args) {
        Tv tv_remotecontrol = new Tv(); //동일한 클래스 타입의 참조변수를 생성해서 초기화
        SmartTv smartTv_remotecontrol = new SmartTv();
        //Tv클래스 타입의 참조변수 tv_remotecontral2를 선언하고, SmarTv의 인스턴스를 생성하여, 이 인스턴스 주소값을 SmarTv에 참조
        Tv tv_remotecontrol2 = new SmartTv();//부모클래스 타입의 참조변수를 생성하고 자식 클래스의 타입을 받아 초기화

        Tv tv = new Tv();
        SmartTv smartTv_control = (SmartTv) tv; //Tv타입 tv를 Smart Tv타입의 smartTv_control로 casting
    }
}
