package day7.GenericEX;

public class Stringprocessor implements processor<String> {

    @Override
    public void process(String input) {
        System.out.println("Processing :" + input);
    }
}
