package day5.AUniversity;

public class AUniversity{
    public static void main(String[] args) {
        Studnt studnt1 = new Studnt.StudentBuilder("dbsdk4211","고윤아","치기공").addAddress("수원").addGrade().builder();
        Studnt studnt2 = new Studnt.StudentBuilder("thk9711","이민우","치기공").addGrade().builder();
        System.out.println(studnt1);
        System.out.println(studnt2);
    }
}
