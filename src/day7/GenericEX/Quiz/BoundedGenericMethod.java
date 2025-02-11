package day7.GenericEX.Quiz;

//3. Compareable<T> 를 확장하는 타입의 두 객체를 비교하는
//제너릭 메소드 compareTo를 작성하세요. 이 메서드를 이용하여 두 숫자를 비교하세요
public class BoundedGenericMethod<T>{
    public  <T extends Comparable<T>> T CompareTo(T a, T b){
        return a.compareTo(b) > 0 ? a : b;
    }

}
