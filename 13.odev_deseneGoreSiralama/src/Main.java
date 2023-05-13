import java.util.Scanner;

public class Main {

    static int desen(int number,int temp){
        if(number>0){
            System.out.println(number);
            number = number-5;
            return desen(number,temp);
        }else {
            desen2(number, temp);
        }return temp;
    }
    static int desen2(int number,int temp){
        if(number< temp){
            System.out.println(number);
            number = number + 5;
            desen2(number,temp);
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int number,temp ;
        number = input.nextInt();
        temp = number;
        System.out.println(desen(number,temp));
        
    }
}
