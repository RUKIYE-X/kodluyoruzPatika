import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz: ");
        float boy = sc.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz: ");
        int kilo = sc.nextInt();

        System.out.println("Vücut Kitle İndeksiniz: "+ kilo/(boy*boy));

    }
}