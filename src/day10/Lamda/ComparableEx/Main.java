package day10.Lamda.ComparableEx;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.order(String::compareToIgnoreCase); //소문자 구분 없이 문자열을 비교하는 메서드
        //person.order((a,b) ->a.compareToIgnoreCase(b));
    }
}

