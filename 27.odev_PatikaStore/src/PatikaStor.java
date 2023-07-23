import java.util.*;

public class PatikaStor {
    static List<Markalar> marka = new ArrayList<>();
    static List<Urunler> urunler = new ArrayList<>();
    static void markaEkle(){
        marka.add(new Markalar(1,"Samsung"));
        marka.add(new Markalar(2,"Lenovo"));
        marka.add(new Markalar(3,"Apple"));
        marka.add(new Markalar(4,"Huawei"));
        marka.add(new Markalar(5,"Casper"));
        marka.add(new Markalar(6,"Asus"));
        marka.add(new Markalar(7,"HP"));
        marka.add(new Markalar(8,"Xiaomi"));
        marka.add(new Markalar(9,"Monster"));

    }
    public static void urunEkle(){
        urunler.add(new CepTelefonu(1, 3199.0, 0, 100, "SAMSUNG GALAXY A51", marka.get(0), "128", 6.5, 4000.0, 6, "Siyah"));
        urunler.add(new CepTelefonu(2, 7379.0, 0, 50, "iPhone 11 64 GB", marka.get(2), "64", 6.1, 3046.0, 6, "Mavi"));
        urunler.add(new CepTelefonu(3, 4012.0, 0, 80, "Redmi Note 10 Pro 8GB", marka.get(7), "128", 6.5, 4000.0, 12, "Beyaz"));

        urunler.add(new NoteBook(1, 7000.0, 0, 20, "HUAWEI Matebook 14", marka.get(3), 16, 512, 14.0));
        urunler.add(new NoteBook(2, 3699.0, 0, 10, "LENOVO V14 IGL", marka.get(1), 8, 1024, 14.0));
        urunler.add(new NoteBook(3, 8199.0, 0, 5, "ASUS Tuf Gaming", marka.get(5), 32, 2048, 15.6));

    }

    static void notebookListele(){
        System.out.println("\nNotebook Listesi\n");
        System.out.println("--------------------------------------------------");
        System.out.println("| ID | Ürün Adı                       | Fiyat       | Marka        | Depolama      | Ekran     | RAM         |");
        System.out.println("--------------------------------------------------");

        for(Urunler urunler1 : urunler){
            if(urunler1 instanceof NoteBook){
                urunler1.goster();
            }
        }
        System.out.println("--------------------------------------------------");

    }
    static void telefonListele(){
        System.out.println("\nCep Telefonu Listesi\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                       | Fiyat       | Marka    | Depolama   | Ekran   | Pil     | RAM      | Renk      | ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        for(Urunler urunler2: urunler){
            if(urunler2 instanceof CepTelefonu){
                urunler2.goster();
            }
        }
        System.out.println("--------------------------------------------------");

    }

    static void listeleMarka(){
        System.out.println("\nMarkalarımız\n--------------");
        for(Markalar markalar : marka){
            System.out.println("- " + markalar.getName());
        }
    }

    static void kullaniciUrunEkle(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün Adı: ");
        String productName = scanner.nextLine();


        System.out.print("Birim Fiyatı: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("İndirim Oranı: ");
        double discountRate = scanner.nextDouble();

        System.out.print("Stok Miktarı: ");
        int stock = scanner.nextInt();

        System.out.print("Marka: ");
        listeleMarka();
        int brandId = scanner.nextInt();
        Markalar selectedBrand = marka.stream()
                .filter(marka -> marka.getId() == brandId)
                .findFirst()
                .orElse(null);

        if (selectedBrand == null) {
            System.out.println("Geçersiz marka seçimi.");
            return;
        }

        System.out.print("Ürün Türü (1: Cep Telefonu, 2: Notebook): ");
        int productType = scanner.nextInt();
        Urunler newUrun;
        if (productType == 1) {
            System.out.print("Telefonun Hafıza Bilgisi (128 GB, 64 GB vb.): ");
            String memory = scanner.next();

            System.out.print("Ekran Boyutu (6.1 Inc, 5.5 Inc vb.): ");
            double screenSize = scanner.nextDouble();

            System.out.print("Pil Gücü: ");
            double batteryPower = scanner.nextDouble();

            System.out.print("RAM: ");
            int ram = scanner.nextInt();

            System.out.print("Renk: ");
            String color = scanner.next();

            newUrun = new CepTelefonu(urunler.size() + 1, unitPrice, discountRate, stock, productName, selectedBrand,
                    memory, screenSize, batteryPower, ram, color);
        } else if (productType == 2) {
            System.out.print("RAM: ");
            int ram = scanner.nextInt();

            System.out.print("Depolama (GB): ");
            int storage = scanner.nextInt();

            System.out.print("Ekran Boyutu (Inç): ");
            double screenSize = scanner.nextDouble();
            newUrun = new NoteBook(urunler.size() + 1, unitPrice, discountRate, stock, productName, selectedBrand,
                    ram, storage, screenSize);
        } else {
            System.out.println("Geçersiz ürün türü seçimi.");
            return;
        }

        urunler.add(newUrun);
        System.out.println("Yeni ürün başarıyla eklendi.");
    }
    static void urunSil(){
        Scanner scan = new Scanner(System.in);
        telefonListele();
        System.out.println("Silmek istediğiniz ürünün id numarasını giriniz: ");
        int num = scan.nextInt();
        for (Urunler product : urunler) {
            if (product.getId() == num) {
                urunler.remove(product);
                System.out.println("Ürün başarıyla silindi.");
                return;
            }
        }
        System.out.println("Böyle bir ürün bulunamadı.");
    }
}
