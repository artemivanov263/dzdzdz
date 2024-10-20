public class Author {
    private String name;
    private String sur_name;


    public String getSur_name(String name) {
        return sur_name;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }public String  fulname (){
        return sur_name + " " + name;


    }
}
