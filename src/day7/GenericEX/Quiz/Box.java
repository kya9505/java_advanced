package day7.GenericEX.Quiz;
//어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요
public class Box <T>{
    public T getValue() {
        return value;
    }

    public void setValue(T t) {
        this.value = t;
    }

    private T value;

    public boolean isOfType(Class<?> classtype){
        return classtype.isInstance(value);
    }
}

class BoxMain{
    public static void main(String[] args) {
        Box<Integer> integerBox =new Box<>();
        integerBox.setValue(50);
        System.out.println(integerBox.isOfType(Integer.class));
    }
}
