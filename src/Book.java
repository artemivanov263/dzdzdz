public class Book {
    private String title;
    private Author author;
    private Integer yers;
    public Book() {
    }

    public Book(String title, Integer yers, Author author) {
        this.title = title;
        this.yers = yers;
        this.author = author;
    }

@Override
    public  String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", yers=" + yers +
                '}';
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;

    }public void setYers(Integer yers) {
        this.yers = yers;
    }

    public Integer getYers() {
        return yers;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}




