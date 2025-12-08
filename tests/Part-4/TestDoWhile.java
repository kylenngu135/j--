import java.lang.System;

public class TestDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            i += 1;
            System.out.println(i);
        } while (i < 5);
        System.out.println(i);
    }
}
