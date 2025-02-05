//package day3.Interface2;
//
//public class CarFactory extends Factory implements IWorkingTogether{
//    public CarFactory( String name,int openHour, int closeHour) {
//        super(openHour, closeHour, name);
//    }
//
//    public CarFactory(String name, char skill){
//        super(name,skill);
//    }
//
//    @Override
//    int makeProducts(char skill) {
//        if(skill=='A') skill =3;
//        else if(skill=='B') skill=2;
//        else if(skill=='C')skill=1;
//        else skill=0;
//        return skill*getWorkingTime();
//    }
//
//    @Override
//    public int workTogether(IWorkingTogether partner) {
//        return getWorkingTime()*2;
//    }
//}
