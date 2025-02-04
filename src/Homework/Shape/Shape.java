package Homework.Shape;

public abstract class Shape {
   protected double area;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(){}
    public Shape(String name) {
        this.name = name;
    }
    abstract void calculationArea();
    public void print(){
        System.out.printf("%s의 면적은 %f%n",name,area);
    }
}
