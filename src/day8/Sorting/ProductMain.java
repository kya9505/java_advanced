package java_advanced.src.day8.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("갤럭시S25",1200000);
        Product p2 = new Product("아이폰15Pro",1370000);
        Product p3 = new Product("샤오미",800000);

        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("List 정렬전");
        list.forEach(System.out::println);

        System.out.println("List 정렬 후");
        Collections.sort(list);
        list.forEach(System.out::println);

        Product[] products = {p1,p2,p3};
        System.out.println("배열 정렬 전 ");
        Arrays.stream(products).forEach(System.out::println);
        System.out.println("List 정렬 후");
        Arrays.sort(products);
        Arrays.stream(products).forEach(System.out::println);
    }
}
