package day7.GenericEX.Quiz;

import java.util.Arrays;

//어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray를 작성하세요
public class GennericMethodEx <T>{

    public void printArry(T[] Array){
        System.out.println(Arrays.toString(Array));
    }
}
