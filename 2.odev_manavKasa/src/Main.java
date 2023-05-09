import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00;
        double toplamTutar;
        int a,e,d,m,p;
        Scanner input = new Scanner(System.in);

        System.out.print("armut kaç kilo: ");
        a = input.nextInt();
        System.out.print("elma kaç kilo: ");
        e = input.nextInt();
        System.out.print("domates kaç kilo: ");
        d = input.nextInt();
        System.out.print("muz kaç kilo: ");
        m = input.nextInt();
        System.out.print("patlican kaç kilo: ");
        p = input.nextInt();

        toplamTutar = armut*a + elma*e + domates*d + muz*m + patlican*p;
        System.out.println("Toplam Tutar: " + toplamTutar);
        // kullanıcıdan girilen kg göre toplam kaç lira tuttuğunu gösteren program.
    }
}