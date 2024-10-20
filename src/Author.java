public class Author {


    private String name;
    private String sur_name;

    public Author() {
    }

    public Author (String name, String sur_name) {
        this.name = name;
        this.sur_name = sur_name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", sur_name='" + sur_name + '\'' +
                '}';
    }
    public void setName(String name,String surname) {
        this.name = name;
        this.sur_name = surname;
    }

   public String getAuthorName() {
       return name + " " + sur_name;
    }
}

