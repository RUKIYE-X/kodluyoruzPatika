import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, -4, 3, 5, 3, -43, 3, 776, 150, -77, 1, 776};
        int counter = 1;

        System.out.println("Dizi : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sıralı Dizi: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j])) {
                        counter++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + counter + " defa tekrar edildi.");
            }
            else if (arr[i] != arr[i-1]) {
                for (int j = 0; j < arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j])) {
                        counter++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + counter + " defa tekrar edildi.");
            }
            counter = 1;
        }

    }
}