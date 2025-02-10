package Day6.Api;

import day4.ex2.Q2.Soundable;

public class UserMain {
    public static void main(String[] args) {
        //얕은 복사
        User user = new User();
        user.setName("Shin");
        User copy = user;
        System.out.println(user.hashCode());
        System.out.println(copy.hashCode());
        System.out.println(user.equals(copy));

        // 깉은 복사
        try {
            User user1 = new User();
            user1.setName("Shin");
            User copy1 = (User)user1.clone(); // clone의 반환값이 object이기때문에 캐스팅

            System.out.println(user1.hashCode());
            System.out.println(copy1.hashCode());
            System.out.println(user1.equals(copy1));
            System.out.println(copy1.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }
}
