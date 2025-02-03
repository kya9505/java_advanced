package day1.ex01;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시","흰색");
        //Phone으로 상속받은 필드
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        //SmartPhone 의 필드
        System.out.println(myPhone.wifi);
        //Phone으로 부터 상속받은 메소드
        myPhone.bell();
        //SmartPhone메소드
        myPhone.setWifi(myPhone.wifi);
    }
}
