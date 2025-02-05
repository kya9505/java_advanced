package day3.Interface2;

public class FactoryMain {

    public static void main(String[] args) {
        // ===== 1st Car Factory Information
        // Factory Name: CarABC
        // openHour: 7 AM, closeHour: 9 PM
        CarFactory CarABC = new CarFactory("CarABC", 7, 21);
        // ===== 2nd Car Factory Information
        // Factory Name: CarXYZ
        // openHour: 8 AM, closeHour: 7 PM
        CarFactory CarXYZ = new CarFactory("CarXYZ", 8, 19);
        // ===== 1st TV Factory Information
        // Factory Name: TVABC
        // openHour: 8 AM, closeHour: 5 PM
        TVFactory TVABC = new TVFactory("TVABC", 8, 17);
        // ===== 2nd TV Factory Information
        // Factory Name: TVXYZ
        // openHour: 9 AM, closeHour: 6 PM
        TVFactory TVXYZ = new TVFactory("TVXYZ", 9, 18);

        FactoryMain ex = new FactoryMain();
        // 각 공장 별로기술력값에 따른 하루 생산량과 파트너 사 협력 시 추가 생산량을 알아본다
        ex.getResult(CarABC, 'A', CarXYZ);
        ex.getResult(CarXYZ, 'B', CarABC);
        ex.getResult(TVABC, 'A', TVXYZ);
        ex.getResult(TVXYZ, 'B', TVABC);

    }

    public void getResult(Factory mainFactory, char mainFactorySkill, IWorkingTogether partner) {
        System.out.println("* " + mainFactory.getFactoryName() + " 공장의 하루 생산량과 파트너 공장 협력 시 추가 생산량은 다음과 같다.");
        System.out.println("1.하루 생산량 = "+ mainFactory.makeProducts(mainFactorySkill));
        if(partner instanceof Factory) { //파트너로 전달된 객체가 팩토리를 상속받는다면 파트너를 팩토리로 형변환하여 공장이름을 출력
            System.out.printf("2.파트너 공장[%s] 협력 시 추가 생산량 = %d\n", ((Factory) partner).getFactoryName(), partner.workTogether(partner));
        }else System.out.println("파트너 공장이 아닙니다.");
        System.out.println("--------------------------------------------------------------");

    }
//
}

