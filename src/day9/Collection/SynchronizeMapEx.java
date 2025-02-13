package day9.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizeMapEx {
    public static void main(String[] args) {
        Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());

        Thread threadA = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++) {
                    map.put(i,"내용"+i);
                }
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <=2000 ; i++) {
                    map.put(i,"내용"+i);
                }
            }
        };
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            ;
            threadB.join();
            ;
        } catch (InterruptedException e) {
            System.out.println("외부 문제로 프로그램 종료");
        } catch (Exception e1){
            e1.printStackTrace();
        }
        int size = map.size();
        System.out.println(size);
    }
}
