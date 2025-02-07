package day5.AUniversity;

public class Studnt {
    private String id;
    private String name;
    private String major;

    private  static String grade = "freshman";
    private String address;

    public Studnt(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.major = studentBuilder.major;
        this.grade = studentBuilder.grade;
        this.address = studentBuilder.address;
    }

    public static class StudentBuilder{
        private String id;
        private String name;
        private String major;

        private String grade;
        private String address;


        public StudentBuilder(String id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public StudentBuilder addGrade(){
            this.grade = Studnt.grade;
            return this;
        }

        public StudentBuilder addAddress(String address){
            this.address =address;
            return this;
        }

        public Studnt builder(){
            return new Studnt(this);
        }
    }

    @Override
    public String toString() {
        return "Studnt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

