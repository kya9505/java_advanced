package day2.ResourceEx;

public class TryWithResource {
    public static void main(String[] args) {
        try (MyResouece resouece = new MyResouece("A")) {
            String data = resouece.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
        System.out.println();
        try (MyResouece resouece = new MyResouece("A")) {
            String data = resouece.read2();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
        System.out.println();
        MyResouece resouece1 = new MyResouece("A");
        MyResouece resouece2 = new MyResouece("B");

        try(resouece1;resouece2){
            String data1 = resouece1.read1();
            String data2 = resouece2.read2();
        } catch (Exception e) {
            System.out.println("try whit resource : "+e.getMessage());
        }
    }
}
