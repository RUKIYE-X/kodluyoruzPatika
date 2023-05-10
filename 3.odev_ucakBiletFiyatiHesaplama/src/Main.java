import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan aldığımız km ve yaş değerlerine göre hangi
        // tür indirim uygulandığı ve ve kaç tutara mal olduğu hesaplanmıştır.
        Scanner input =new Scanner(System.in);
        int km,age,type;
        double normalprice,discount_rate1,discount_rate2,discount_rate3,price1,totalPrice;

        System.out.print("mesafeyi giriniz: ");
        km = input.nextInt();
        System.out.print("yasınızı giriniz: ");
        age = input.nextInt();
        System.out.print("yolculuk tipi seçiniz: 1=>tek yön - 2=>gidiş dönüş");
        type = input.nextInt();
        int choose = type == 1 ? 1 : 2;

        normalprice = km*(0.10);
        // indirim oranlari
        discount_rate1 = normalprice * 0.50;
        discount_rate2 = normalprice * 0.10;
        discount_rate3 = normalprice * 0.30;

        if(km>0) {// km cinsleri negatif olmayan değerlerdir bu koşul ile negatif olmasının önüne geçmiş oluruz.
            if (age > 0 && age < 12) {
                if (choose == 1) {
                    price1 = normalprice - discount_rate1;
                    System.out.println("toplam ücretiniz: " + price1);
                } else {
                    price1 = normalprice - discount_rate1;
                    totalPrice = (price1 - price1 * 0.20) * 2;
                    System.out.println("toplam ücretiniz: " + totalPrice);
                }
            } else if (age >= 12 && age <= 24) {
                if (choose == 1) {
                    price1 = normalprice - discount_rate2;
                    System.out.println("toplam ücretiniz: " + price1);
                } else {
                    price1 = normalprice - discount_rate2;
                    totalPrice = (price1 - price1 * 0.20) * 2;
                    System.out.println("toplam ücretiniz: " + totalPrice);
                }
            } else if (age > 24 && age < 65) { // 24-65 yaş aralığındaki bireylere sadece yol indirimi ve eğer 2. dönüş tipini seçerse indiirm yapılırç
                if (choose == 1) {
                    System.out.println("toplam ücretiniz: " + normalprice);
                } else {
                    totalPrice = (normalprice - normalprice * 0.20) * 2;
                    System.out.println("toplam ücretiniz: " + totalPrice);
                }
            } else if (age > 65) {
                if (choose == 1) {
                    price1 = normalprice - discount_rate3;
                    System.out.println("toplam ücretiniz: " + price1);
                } else {
                    price1 = normalprice - discount_rate3;
                    totalPrice = (price1 - price1 * 0.20) * 2;
                    System.out.println("toplam ücretiniz: " + totalPrice);
                }
            }
        }else{
            System.out.println("Hatalı Veri Girdiniz!!");
        }
    }
}