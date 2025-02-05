package day3.Interface2;

public class TVFactory extends Factory implements IWorkingTogether{
    public TVFactory(){}
    public TVFactory( String name, int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }

    @Override
    int makeProducts(char skill) {
        switch (skill){
            case 'A' :
                return getWorkingTime()*8;
            case 'B' :
                return getWorkingTime()*5;
            case 'C' :
                return getWorkingTime()*3;
            default: return 0;
        }


//        if(skill=='A') skill=8;
//        else if(skill=='B') skill=5;
//        else if(skill=='C') skill=3;
//        else skill = 1;
//        return skill*getWorkingTime();
   }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('C');

    }
}
