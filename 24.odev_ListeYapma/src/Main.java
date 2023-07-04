
public class Main {
    public static void main(String[] args) {
        ListeSinifi<Integer> liste = new ListeSinifi<>();
        //System.out.println(liste.getCapacity());
        //System.out.println(liste.size());
        System.out.println(liste.isEmpty() ? "Boş" : "Dolu");
        liste.add(12);
        liste.add(3);
        liste.add(5);
        liste.add(9);
        liste.add(8);
        liste.add(3);
        System.out.println(liste.get(1));
        System.out.println(liste.isEmpty() ? "Boş" : "Dolu");
        liste.set(2, 29);
        System.out.println(liste.size());
        liste.toString();
        System.out.println(liste.indexOf(3));
        System.out.println(liste.lastIndexOf(3));
        liste.toArray();
        //liste.clear();
        //System.out.println(liste.size());
        //liste.toString();
        System.out.println(liste.sublist(1, 4));
        System.out.println(liste.contains(94) ? "Var" : "Yok");


    }
}