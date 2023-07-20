import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String bookName;
    private int bookPage;
    private String writeName;
    private String releaseDate;

/*
    @Override
    public int compareTo(Book o1) {
        return this.getBookName().compareTo(o1.getBookName());
    }

 */
    @Override
    public int compareTo(Book o1){
        return this.bookPage - o1.bookPage;
    }

    public Book(String bookName,int bookPage,String writeName,String releaseDate){
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.writeName = writeName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return this.bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getWriteName() {
        return this.writeName;
    }

    public void setWriteName(String writeName) {
        this.writeName = writeName;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
