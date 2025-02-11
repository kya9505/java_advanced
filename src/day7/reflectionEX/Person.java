package day7.reflectionEX;

public class Person {
    public  String name;
    private  int age;
    public  static  int weight = 50;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getFiled(){
        System.out.printf("이름 : %s 나이 :%d\n",name,age);
    }
}
