package day10.Lamda;

public class WorkMain {
    public static void main(String[] args) {
            Person person1 = new Person("홍길동","프로그래밍","프로그래밍은 정말 재미있어!!" );

            person1.action1((name,job)->{System.out.println(name+"씨가 "+job+"을 합니다.");});
            person1.action2(contents -> System.out.println(contents));
            // 홍길동 씨가  프로그래밍을 합니다.  출력
            //"프로그래밍은 정말 재미있어!!"  말합니다. 출력

        Person person2 = new Person("조수미","오페라가수","저를 오랫동안 사랑해주셔서 감사합니다.","밤의 아리아");
        person2.action1((name, job) -> System.out.println(name+"는"+job+"입니다."));
        person2.action2(contents -> System.out.println(contents));
        person2.action3((song)-> System.out.println(song+"노래를 부릅니다."));
    }
}