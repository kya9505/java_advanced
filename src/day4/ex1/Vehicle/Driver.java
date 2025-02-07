package day4.ex1.Vehicle;

public class Driver {
    //메소드 선언부에서 매개변수 클래스타입의 매개변수
    Vehicle vehicle = new Bus();

    public void drive(){
        vehicle.run();
//        Object obj = vehicle;
//        Vehicle v = (Vehicle)obj;
//
//        if(vehicle instanceof Taxi || vehicle instanceof Bus){
//            vehicle.run();} else {
//            System.out.println("운영자격이 해당하지 않습니다.");
    }


}

