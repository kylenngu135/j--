public class SwitchTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        switch (x) {
            case 0:
                y = 1;
            case 1:
            case 2:
            case 3:
            default:
                y = 3;
        }
    }
}
