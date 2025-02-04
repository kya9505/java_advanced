package day2.ExceptionEx;

public class Exception2 {
    public static void main(String[] args) {
        String[] stringarry ={"100","i00"};
        for(int i =0; i<stringarry.length;i++){
            try {
                int value = Integer.parseInt(stringarry[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다." + e.getMessage());
            }/*catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없는 데이터입니다."+e.getMessage());
            }*/
            catch (NullPointerException | NumberFormatException e1){
                System.out.println("실행에 문제가 있습니다."+e1.getMessage());
            }
        }
    }
}
