package Day6.Api;
//객체 복사 메서드를 사용하기위해 Cloneable 인터페이스를 구현하여 clone() 재정의하여 사용한다.
public class User implements Cloneable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void setUserid(String userid) {
    }
}
