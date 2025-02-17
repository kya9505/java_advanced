package day8.comparator;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//ex) 홍길동 32세
//    임준오 48세



public class Main {

    public static void main(String[] args) {
        @Data
        class User{
            private String name;
            private int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
q
        User user1 = new User("고윤아",31);
        User user2 = new User("이민우",34);
        User user3 = new User("강아지",64);
        User user4 = new User("고윤아",64);
        User user5 = new User("옥세원",31);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        Collections.sort(users , Comparator.comparing(User::getName)); //이름 오름차순
        for(User user : users) System.out.println(user.name + " " + user.age+"세");
        ;
        System.out.println();

        Collections.sort(users , Comparator.comparing(User::getAge)); //나이 오름차순
            for(User user : users) System.out.println(user.name + " " + user.age+"세");
        System.out.println();

        Collections.sort(users , Comparator.comparing(User::getName).thenComparing(User::getAge)); // 이름 오름차순 후 나이 기준 정렬
            for(User user : users) System.out.println(user.name + " " + user.age+"세");


    }
}
