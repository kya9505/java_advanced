package day2.ExceptionEx;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작 \n");
        printLength("This is Java Programming");
        printLength(null);

        try {
            Class.forName("java.lang.String1");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }

        System.out.println("프로그램 종료 \n");
    }
    public static void printLength(String data){
        int result = 0;
        try {
            result = data.length();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // 예외 정보를 출력함1
//            System.out.println(e.toString()); //2
//            e.printStackTrace(); // 3
        } finally {
        }
        System.out.println("문자의 수 : "+result);
    }
}
