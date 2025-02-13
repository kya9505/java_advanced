package day9.Collection;

import java.util.List;

public class UmodifiableEx {
    public static void main(String[] args) {
        List<String> immutableList1 = List.of("A", "B", "C");
        immutableList1.add("E");
    }
}

