package day3.Interfcae01;

public interface RemoteControl {
    public void turnOn();
    public void turnOff();

    public static final int MAX_VOLUME = 30;
    public static final int MIN_VOLUME = 0;

    public void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("쉿 모드로 전환됩니다.");
            setVolume(MIN_VOLUME);
        }else System.out.println("쉿모드를 해제합니다.");
    }

    public static void changeBattery(){
        System.out.println("건전지를 교체합니다.");
    }
}
