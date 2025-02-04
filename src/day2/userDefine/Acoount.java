package day2.userDefine;

public class Acoount {
    private long balance;

    public Acoount(){}

    public Acoount(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(int money){
        this.balance += money;
    }
    public void withdraw(int money) throws InsufficientEx{
        if(this.balance < money){
            throw new InsufficientEx("잔고 부족으로 출금 불가"+(money-this.balance)+"부족합니다.");
        }
        this.balance += money;
    }
}
