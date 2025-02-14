package day10.Lamda.BottonEx;

public class BottonEx {
    public static void main(String[] args) {
        Button button = new Button();

        button.setClickListener(()-> System.out.println("버튼이 클릭되었습니다."));
        button.click();

        Button cancleButton = new Button();
        cancleButton.setClickListener(()-> System.out.println("취소버튼이 클릭되었습니다."));
        cancleButton.click();
    }
}
