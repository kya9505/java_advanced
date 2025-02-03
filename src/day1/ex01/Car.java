package day1.ex01;

public class Car {
    int Speed;

    @Override
    public String toString() {
        return "현재 스피드는 " + this.Speed;
    }

    final void stop(){
         System.out.println("차를 멈춤");
         this.Speed = 0 ;
    }

    public void speedUp(){
         this.Speed +=1;
    }
}
