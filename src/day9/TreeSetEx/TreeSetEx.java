package day9.TreeSetEx;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(80);
        scores.add(89);
        scores.add(82);
        scores.add(87);
        scores.add(77);
        for(Integer score : scores) System.out.println(score + "점");

        System.out.println("꼴등 : " +scores.first());
        System.out.println("일등 : " +scores.last());
        System.out.println("85 아래 점수 : " +scores.lower(85));
        System.out.println("85 위 점수 : " +scores.higher(85));
        System.out.println("85 바로 아래 : " +scores.floor(85));
        System.out.println("85 바로 위: " +scores.ceiling(85));


        //내림차순 정렬
        NavigableSet<Integer> descSoures = scores.descendingSet();
        for(Integer s : descSoures) System.out.println(s + "점");
    }
}
