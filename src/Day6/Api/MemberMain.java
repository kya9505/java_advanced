package Day6.Api;

public class MemberMain {
    public static void main(String[] args) {
        Member1 m1 = new Member1("윤아",5);
        Member1 m2 = new Member1("윤아",5);
        System.out.println(m1.name());
        System.out.println(m1.age());
        System.out.println(m1.equals(m2));
        System.out.println(m2.toString());

    }
}
