package java_advanced.src.day8.Sorting;

public class Student implements Comparable<Student>{

    private int sno;
    private  String name;

    @Override
    public int compareTo(Student o) {
//       if(this.sno>o.sno) return 1;
//       else if (this.sno == o.sno) return 0;
//       else return -1; //자리바꿈이 일어남
//        return  this.sno - o.sno;

        //학번순으로 내림차순 정렬 후 학번이 같으면 이름순으로 정렬
        if(this.sno-o.sno == 0 ) return this.name.compareTo(o.name);
        else return this.sno - o.sno;

    }
}
