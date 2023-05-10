import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int date,remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihinizi Giriniz: ");
        date = input.nextInt();
        remainder = date % 12;

        if(remainder == 0){
            System.out.println("Çin Zodyağı Burcunuz: maymun");
        }else if(remainder == 1){
            System.out.println("Çin Zodyağı Burcunuz: horoz");
        }else if(remainder == 2){
            System.out.println("Çin Zodyağı Burcunuz: köpek");
        }else if(remainder == 3){
            System.out.println("Çin Zodyağı Burcunuz: domuz");
        }else if(remainder == 4){
            System.out.println("Çin Zodyağı Burcunuz: fare");
        }else if(remainder == 5){
            System.out.println("Çin Zodyağı Burcunuz: öküz");
        }else if(remainder == 6){
            System.out.println("Çin Zodyağı Burcunuz: kaplan");
        }else if(remainder == 7){
            System.out.println("Çin Zodyağı Burcunuz: tavşan");
        }else if(remainder == 8){
            System.out.println("Çin Zodyağı Burcunuz: ejderha");
        }else if(remainder == 9){
            System.out.println("Çin Zodyağı Burcunuz: yılan");
        }else if(remainder == 10){
            System.out.println("Çin Zodyağı Burcunuz: at");
        }else if(remainder == 11){
            System.out.println("Çin Zodyağı Burcunuz: koyun");
        }
    }
}