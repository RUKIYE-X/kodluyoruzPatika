import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatikaStor.markaEkle();
        PatikaStor.urunEkle();

        while (true) {
            System.out.println("\nPatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");

            System.out.print("Tercihiniz : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PatikaStor.notebookListele();
                    System.out.println("Ürün eklemek ister misiniz\n" +
                            "1-Evet\n" +
                            "2-Hayır");
                    int cevap = scanner.nextInt();
                    if(cevap == 1){
                        PatikaStor.kullaniciUrunEkle();
                    }else if(cevap == 2){
                        continue;
                    }else{
                        System.out.println("Geçersiz tercih!!");
                    }
                    break;
                case 2:
                    PatikaStor.telefonListele();
                    System.out.println("Ürün eklemek veya silmek ister misiniz\n" +
                            "1-Evet\n" +
                            "2-Hayır");
                    int cevap2 = scanner.nextInt();
                    if(cevap2 == 1){
                        System.out.println("1-Ekle\n2-Sil");
                        int cevap3 = scanner.nextInt();
                        if(cevap3 == 1){
                            PatikaStor.kullaniciUrunEkle();
                        }else if(cevap3 == 2){
                            PatikaStor.urunSil();
                        }else{
                            System.out.println("Geçersiz tercih!");
                        }

                    }else if(cevap2 == 2){
                        continue;
                    }else{
                        System.out.println("Geçersiz tercih!!");
                    }
                    break;
                case 3:
                    PatikaStor.listeleMarka();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz tercih, tekrar deneyin.");
            }
        }
    }
}