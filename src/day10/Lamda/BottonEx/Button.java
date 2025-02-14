package day10.Lamda.BottonEx;

public class Button {

    @FunctionalInterface
    public static interface ClickListener{
        void onClik();
    }

    private  ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClik();
    }
}
