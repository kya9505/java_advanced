package day8.Board;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new java.util.LinkedList<>();
        //시작, 끝 시간 저장할 변수 선언
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000 ; i++) {
            list1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns\n","ArrayList 걸린 시간",(endTime-startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000 ; i++) {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns\n","LinkedList 걸린 시간",(endTime-startTime));
    }
}
