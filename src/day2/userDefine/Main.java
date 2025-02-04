package day2.userDefine;

public class Main {
    public static void main(String[] args) {
        Acoount acoount = new Acoount();
        acoount.deposit(100000);
        System.out.println("현재 잔액은 "+acoount.getBalance()+"입니다.");

        try {
            acoount.withdraw(200000);
        } catch (InsufficientEx e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
