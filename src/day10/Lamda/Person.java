package day10.Lamda;

public class Person {
    private String name;
    private String job;
    private String contents;
    private String song;

    public Person(String name, String job, String contents) {
        this.name = name;
        this.job = job;
        this.contents = contents;
    }

    public Person(String name, String job, String contents, String song) {
        this.name = name;
        this.job = job;
        this.contents = contents;
        this.song = song;
    }

    public void action1(Workable workable) {
        workable.work(name, job);
    }

    public void action2(Speaker speakable){
        speakable.speak(contents);
    }

    public void action3(Singing singer){
        singer.song(song);
    }

}

// 홍길동 씨가  프로그래밍을 합니다.  출력
//"프로그래밍은 정말 재미있어!!"  말합니다. 출력

