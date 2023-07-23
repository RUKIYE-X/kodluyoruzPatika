public class CepTelefonu extends Urunler{
    private String hafiza;
    private double ekranBoyutu;
    private double pil;
    private int ram;
    private String renk;

    public CepTelefonu(int id,double fiyat,double indirim,int stok,String urunAdi,Markalar marka,String hafiza,double ekranBoyutu,double pil,int ram,String renk){
        super(id,fiyat,indirim,stok,urunAdi,marka);
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.pil = pil;
        this.ram = ram;
        this.renk = renk;

    }
    @Override
    public void goster(){
        System.out.format("| %-2d | %-30s | %-8.2fTL | %-9s | %-9s | %-2.1f Inc | %-8.1f | %-6d MB | %-10s |\n",
                getId(),getUrunAdi(),getFiyat(),getMarka().getName(),hafiza,ekranBoyutu,pil,ram,renk);
    }

}
