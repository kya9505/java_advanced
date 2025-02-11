package day7.LamdaEx;

@FunctionalInterface
public interface Transfor<T,R> {
    R transform(T input);
}
