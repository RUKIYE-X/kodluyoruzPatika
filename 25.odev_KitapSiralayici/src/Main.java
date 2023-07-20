import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> b = new TreeSet<>();
        b.add(new Book("Satranç",90,"Stefen Zveig","12-12-2009"));
        b.add(new Book("Olağan üstü bir gece",340,"yazar2","12-4-2001"));
        b.add(new Book("Karanlık",120,"yazar3","12-2-2012"));
        b.add(new Book("Beyaz şeytan",490,"yazar4","1-1-2019"));
        b.add(new Book("Kalabalık",40,"yazar5","12-12-1999"));
/*
        for(Book bs : b){
            System.out.println(bs.getBookName());
        }

 */
        for(Book bs : b){
            System.out.println(bs.getBookName() + " : " + bs.getBookPage());
        }


    }
}