import java.util.List;

public class Yaris implements Runnable{
    private List<Integer> originalList;
    private List<Integer> ciftList;
    private List<Integer> tekList;

    public Yaris(List<Integer> originalList,List<Integer> ciftList,List<Integer> tekList){
        this.originalList = originalList;
        this.ciftList = ciftList;
        this.tekList = tekList;
    }
    @Override
    public void run() {

        for(Integer sayi : originalList){
            if(sayi % 2 == 0){
                synchronized (ciftList){
                    ciftList.add(sayi);
                }
            }else{
                synchronized (tekList){
                    tekList.add(sayi);
                }
            }
        }
    }
}
