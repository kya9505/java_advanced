package day3.Interfcae01;

public class Tv implements RemoteControl{
   int voulume;

    @Override
    public void turnOn() {
        System.out.println("TV전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV전원을 켭니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.voulume = RemoteControl.MAX_VOLUME;
            System.out.println("현재 해당 제품의 볼륨 최대값으로 셋팅");
        }else if(volume<RemoteControl.MIN_VOLUME){
            this.voulume = RemoteControl.MIN_VOLUME;
            System.out.println("mute");
        }else {
            this.voulume = volume;
            System.out.println("현재 TV 볼륨은 "+this.voulume);
        }
    }
}
