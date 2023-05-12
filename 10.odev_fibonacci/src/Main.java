import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.println("Bir Sayı Giriniz: ");
        number = input.nextInt();

        int first = 0,second = 1,temp;
        System.out.println(first + "\n" + second);
        for(int i = 2;i<number+1;i++){
            temp = first + second;
            System.out.println(temp);
            first = second;
            second = temp;
        }
    }
}