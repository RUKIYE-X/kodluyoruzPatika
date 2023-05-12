
public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
    }
}