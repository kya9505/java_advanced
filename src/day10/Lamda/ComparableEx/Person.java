package day10.Lamda.ComparableEx;

public class Person {
    public   void order(Comparable calcuable){
        String a = "dd";
        String b = "aa";
        int resut = calcuable.compareTo(a, b);

        if(resut<0){
            System.out.println(a + "는" + b + "보다 앞에 옵니다.");
        }else if(resut ==0 ){
            System.out.println(a+"와"+b+"같습니다.");
        }else  System.out.println(b + "는" + a + "보다 앞에 옵니다.");

    }
}
