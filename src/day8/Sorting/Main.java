package day8.Sorting;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//ex) 홍길동 32세
//    임준오 48세
@Data
class User implements Comparable<User>{
    String name;
    int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(User o) {
        if(o.age - this.age == 0 ) return this.name.compareTo(o.name);
        else return o.age - this.age;
    }

}
public class Main {

    public static void main(String[] args) {

        User user1 = new User("고윤아",31);
        User user2 = new User("이민우",34);
        User user3 = new User("고유진",29);
        User user4 = new User("심보미",31);
        User user5 = new User("옥세원",31);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        Collections.sort(users);
        users.forEach(System.out::println);
    }
}
