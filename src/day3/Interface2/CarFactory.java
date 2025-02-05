package day3.Interface2;

public class CarFactory extends Factory implements IWorkingTogether{

    public CarFactory( String name,int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }
    public CarFactory(){
        super();
    };


    @Override
    int makeProducts(char skill) {
        switch (skill){
            case 'A' :
                return getWorkingTime() *3;

            case 'B' :
                return getWorkingTime() *2;

            case 'C' :
                return getWorkingTime() *1;

            default:
                return 0;
        }

//        if(skill=='A') skill =3;
//        else if(skill=='B') skill=2;
//        else if(skill=='C')skill=1;
//        else skill=0;
//        return skill*getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('B');
    }
}
