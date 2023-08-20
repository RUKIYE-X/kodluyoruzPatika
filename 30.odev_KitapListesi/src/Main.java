import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> array = new ArrayList<>();
        array.add(new Book("Kitap1",340,"yazar1","09-09-2002"));
        array.add(new Book("Kitap2",40,"yazar2","09-09-2002"));
        array.add(new Book("Kitap3",30,"yazar3","09-09-2002"));
        array.add(new Book("Kitap4",310,"yazar4","09-09-2002"));
        array.add(new Book("Kitap5",240,"yazar5","09-09-2002"));
        array.add(new Book("Kitap6",90,"yazar6","09-09-2002"));
        array.add(new Book("Kitap7",320,"yazar7","09-09-2002"));
        array.add(new Book("Kitap8",140,"yazar8","09-09-2002"));
        array.add(new Book("Kitap9",3460,"yazar9","09-09-2002"));
        array.add(new Book("Kitap10",60,"yazar10","09-09-2002"));

        Map<String,String> map = array.stream().collect(Collectors.toMap(Book::getBookName, Book::getAuthorName));

        map.forEach((bookName,authorName) -> System.out.println("kitap: " + bookName + "- yazar: "+ authorName));

        List<Book> liste = array.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        liste.forEach(i-> System.out.println("kitap ismi: " + i.getBookName()));
    }
}