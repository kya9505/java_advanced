package day7.GenericEX;

public class Box<T>{ //T는 Box의 인스턴스를 생성할 대 어떤 참조타입으로 대체될 수 있는 타입매개변수
    //객체타입은 인스턴스 시 결정
    private T item;
    private  int count = 0; //item의 수를 추적하는 필드

    public T getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public void setItem(T item) {
        this.item = item;
        this.count++;
    }
}


class Main{
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("인형");
        stringBox.setItem("레고");
        stringBox.setItem("기차장난감");
        System.out.println(stringBox.getItem());
        System.out.println(stringBox.getCount());
    }
}