package day2.homework;

public class CardPayment extends Payment{

    private String cardNumber;
    private String cardPassword;
    private int monthlyinstallment;

    public CardPayment(String shopName, String productName, long productPrice,String cardNumber,String cardPassword,int monthlyinstallment) {
        super(shopName, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyinstallment = monthlyinstallment;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public int getMonthlyinstallment() {
        return monthlyinstallment;
    }

    public void setMonthlyinstallment(int monthlyinstallment) {
        this.monthlyinstallment = monthlyinstallment;
    }

    @Override
    public String toString() {
        return "[ 신용카드 결제 정보]\n" + " 상점명 : " + shopName +"\n상품명 :" + productName +"\n상품가격 : " + productPrice +
                "\n신용카드번호 : "+cardNumber+"\n할부개월 : "+monthlyinstallment;
    }

    @Override
    public void pay() throws PayException {
        if(monthlyinstallment<0 | productPrice<=0){
            throw new PayException("가격이나 할부개월 수가 잘못되었습니다.");
        }else System.out.println("신용카드가 정상적으로 결제되었습니다.");
    }
}
