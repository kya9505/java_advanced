package day8.Sorting;

public class StudentTest {
    public static void main(String[] args) {
        Student 철수 = new Student(2501351,"김철수");
        Student 영희 = new Student(5250515,"최영희");

        int isBig = 철수.compareTo(영희);
        System.out.println(isBig);


    }
}
