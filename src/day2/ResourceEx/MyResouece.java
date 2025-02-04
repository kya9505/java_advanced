package day2.ResourceEx;

public class MyResouece implements AutoCloseable{
    private String name;

    public MyResouece(String name) {
        this.name = name;
        System.out.println("[myResource]("+name+") 열기");
    }
    public String read1(){
        System.out.println("[myResource]("+name+") 읽기");
        return "200"; // 수행완료 메세지
    }
    public String read2(){
        System.out.println("[myResource]("+name+") 읽기");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[myResource]("+name+") 닫기");

    }
}
