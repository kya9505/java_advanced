package day1;

public class Student extends Person{
    int StudentNo;

    public Student(String name,int studentNo) {
        super(name);
        this.StudentNo = studentNo;
    }

    public void study(){
        System.out.println("공부를 합니다.");
    }
}
