package day9.TreeSetEx;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Runnable task1 = () ->{
//            for (int i = 0; i <10 ; i++) {
//                System.out.println("hello");
//            }
//        };
//
//          Runnable task2 = () ->{
//            for (int i = 0; i <10 ; i++) {
//                System.out.println("java");
//            }
//        };
//        Thread thread1 = new Thread(task1);
//        Thread thread2 = new Thread(task2);
//        thread1.start();
//        thread2.start();
//
        List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().filter(num-> num%2 == 0).forEach(System.out::print);
    }
}
