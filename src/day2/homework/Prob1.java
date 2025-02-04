package day2.homework;

import java.util.Scanner;
//BufferedReader(new InputStreamReader(System.in)) 사용하셔도 됩니다.

public class Prob1 {
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str = scan.nextLine();
		int result = 0;
		//여기를 작성하십시오.
		convert(str);
	}

	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	private static int convert(String str) {
        //여기를 작성하십시오.
        int str1 = 0;
        try {
            str1 = Integer.parseInt(str);
			System.out.println("변환된 숫자는 "+str1+"입니다.");
		}catch (NumberFormatException e){
			System.out.println("예외가 발생되었습니다. 입력한 문자열 중 정수가 없습니다."+e.getMessage());
		}
        return str1;
    }

}