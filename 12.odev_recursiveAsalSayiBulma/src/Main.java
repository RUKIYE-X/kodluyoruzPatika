import java.util.Scanner;

public class Main {
    static boolean asal(int sayi, int i) {
        if (sayi <= 2) {
            return sayi == 2;
        }
        if (sayi % i == 0) {
            return false;
        }
        if (i * i > sayi) {
            return true;
        }
        return asal(sayi, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            if (asal(sayi, 2)) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
    }
}