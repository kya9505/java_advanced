package day8.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Member> members = new HashSet<>();

        members.add(new Member("홍길동",30));
        members.add(new Member("홍길동",30));
        members.add(new Member("홍동동",30));

        for (Member member : members) System.out.println(member.getName());
    }
}
