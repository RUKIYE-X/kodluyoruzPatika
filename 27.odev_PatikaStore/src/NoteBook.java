import java.util.ArrayList;
import java.util.List;

public class NoteBook extends Urunler{
    private int ram;
    private int depolama;
    private double ekranBoyutu;

    public NoteBook(int id,double fiyat,double indirim,int stok,String urunAdi,Markalar marka,
                    int ram,int depolama,double ekranBoyutu){
        super(id,fiyat,indirim,stok,urunAdi,marka);
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
    }
    public void goster(){
        NoteBook noteb = new NoteBook(1,7500.0,0.30,20,"Huwaei d14",getMarka(),8,512,14.0);
        System.out.format("| %-2d | %-30s | %-9.2f TL | %-9s | %-9d GB | %-8.1f Inc | %-6d GB |\n",
                getId(),getUrunAdi(),getFiyat(),getMarka().getName(),depolama,ekranBoyutu,ram);
    }

}
