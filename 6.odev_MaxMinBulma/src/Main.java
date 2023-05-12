import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, count, maxNumber = 0, minNumber = 0;
        System.out.println("Kaç tane sayı Gireceksiniz: ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Sayıyı Giriniz: ");
            number = input.nextInt();

                if (maxNumber < number) { // girilen sayının geçici maxNumber değeri ile karşılaştırılır büyük ise
                    maxNumber = number;   // yeni max değeri number sayısı olur
                }
                if(minNumber > number || minNumber == 0){// girilen sayının geçici maxNumber değeri ile karşılaştırılır büyük ise
                    minNumber = number;                  // yeni max değeri number sayısı olur
                }
        }
        System.out.println("En büyük Sayı: " + maxNumber);
        System.out.println("En Küçük Sayı: " + minNumber);
    }
}