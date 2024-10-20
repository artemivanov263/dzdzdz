public class Book {
    private String title;
    private Author author;
    private Integer yers;

    public Integer getYers() {
        return yers;
    }

    public void setYers(Integer yers) {
        this.yers = yers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getinfo(){

        return title + " " + yers + " " + author.fulname();
    }


    }



