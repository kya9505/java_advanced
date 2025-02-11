package day7.GenericEX.WildCard;

public class Applicant <T> {
   public T kind;

    public Applicant(T t){
        this.kind = t;
    }

}
