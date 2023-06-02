import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını Giriniz: ");
        int number = input.nextInt();
        int[] list = new int[number];

        for (int i = 0; i < number; i++) {
            list[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(list));

        int temp = 0;
        int temp2 = ((number-1)*number)/2;
        while (temp2 > 0) {
            for (int j = 0; j < number - 1; j++) {
                if (list[j + 1] < list[j]) {
                    temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
            temp2--;
        }

        System.out.println(Arrays.toString(list));

    }
}