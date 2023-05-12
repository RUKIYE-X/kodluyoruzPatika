import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        // Girilen sayının mükemmel sayı olup olmadığını bulan program
        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();
        for (int i = 1; i < number / 2 + 1; i++) {
            if (number % i == 0) { // eğer girilen sayı tam bölünüyorsa toplam değişkeninin içine atılır
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " Bir Mükemmel Sayıdır");
        } else {
            System.out.println(number + " Bir Mükemmel Sayı Değildir");
        }
    }
}