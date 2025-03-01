package java_advanced.src.day8.Sorting;

public class StudentTest {
    public static void main(String[] args) {
        Student 철수 = new Student();
        Student 영희 = new Student();

        int isBig = 철수.compareTo(영희);
        System.out.println(isBig);


    }
}

