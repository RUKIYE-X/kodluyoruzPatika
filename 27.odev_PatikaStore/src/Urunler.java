public abstract class Urunler {

    private int id;
    private double fiyat;
    private double indirim;
    private int stok;
    private String urunAdi;

    private Markalar marka;

    public Urunler(int id,double fiyat,double indirim,int stok,String urunAdi,Markalar marka){
        this.id = id;
        this.fiyat = fiyat;
        this.indirim = indirim;
        this.stok = stok;
        this.urunAdi = urunAdi;
        this.marka = marka;
    }

    public int getId(){
        return this.id;
    }

    public double getFiyat() {
        return this.fiyat;
    }

    public double getIndirim() {
        return this.indirim;
    }

    public int getStok() {
        return this.stok;
    }

    public String getUrunAdi() {
        return this.urunAdi;
    }

    public Markalar getMarka() {
        return this.marka;
    }

    public abstract void goster();
}
