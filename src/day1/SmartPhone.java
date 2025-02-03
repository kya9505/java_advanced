package day1;

public class SmartPhone extends Phone{

    //필드선언
    public boolean wifi;

    //생성자 선언
    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }

    @Override
    public void bell() {
        System.out.print("띠리리리링  ");
        super.bell();
        System.out.println();
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        if(this.wifi == false) internet();
    }




}
