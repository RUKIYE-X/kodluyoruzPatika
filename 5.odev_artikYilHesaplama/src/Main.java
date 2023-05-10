import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int date;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        date = input.nextInt();

        if(date % 100 == 0){ // ilk önce 100 ün katı olup olmadığına baktık sonra 4 ile kalanına baktık.
            if(date % 400 == 0){
                System.out.println("Artık Yıl");
            }else{
                System.out.println("Artık Yıl Değil");
            }
        }else if(date % 4 == 0){
            System.out.println("Artık Yıl");
        }else{
            System.out.println("Artık Yıl Değil");
        }
    }// kullanıcıdan girilen yıl ın artık yıl olup olmadığını bulan program.
}