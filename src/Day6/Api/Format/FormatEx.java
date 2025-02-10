package Day6.Api.Format;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatEx { public static void main(String[] args) {
    String text = "123456";
    boolean result1 = text.matches("[0-9]+");   //숫자로 이루어진 문자열인가?
    System.out.println(result1);

    String text2 = "power98432*-;";
    String result2 = text2.replaceAll("[^a-z0-9]","0"); // 영문자와 숫자를 제외한 문자를 모두 0으로 치환
    System.out.println(result2);

    String text3 = "power98432*-;";
    String[] texts = text3.split("[0-9]+");
    for(String data : texts) System.out.println(data);

    String text4 = "10 20 30";
    texts = text3.split("\b");
    for(String data : texts) System.out.println(data);

    //Pattern 클래스 사용
    String patternString = "^[0-9]*$";
    Pattern pattern = Pattern.compile(patternString);

    //샘플 문자열
    String text5 = "123123";
    String text6 = "123숫자입니다00";

    boolean result = Pattern.matches("^[0-9]*$", text6);
    System.out.println(result);

    //Matcher클래스 (스터디 하면서 추가적으로 학습해 주세요)

    String thing = "hello9888*-;hi0000";
    Pattern pattern1 = Pattern.compile("[a-z]+[0-9]+");
    Matcher matcher = pattern1.matcher(thing);

    while(matcher.find()){
        System.out.println(matcher.group());
    }



}
}
