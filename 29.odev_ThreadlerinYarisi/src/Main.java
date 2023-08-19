import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Integer> orjinallList = new ArrayList<>();

        for(int i = 1;i<=10000;i++){
            orjinallList.add(i);
        }
        int parcaBoyutu = orjinallList.size() / 4;

        List<List<Integer>> parcalar = new ArrayList<>();

        for(int i = 0;i< orjinallList.size();i += parcaBoyutu){
            int endIndex = Math.min(i + parcaBoyutu, orjinallList.size());
            parcalar.add(orjinallList.subList(i,endIndex));
        }
        List<Integer> ciftSayilar = new ArrayList<>();
        List<Integer> tekSayilar = new ArrayList<>();

        List<Thread> threads = new ArrayList<>();

        for(List<Integer> parca : parcalar){
            Thread thre = new Thread(new Yaris(parca,ciftSayilar,tekSayilar));
            threads.add(thre);
            thre.start();
        }

        for(Thread t0 : threads){
            try {
                t0.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("cift sayılar: " + ciftSayilar);
        System.out.println("tek sayılat: " + tekSayilar);

    }
}