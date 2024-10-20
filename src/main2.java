public class main2 {

    public static void main(String[] args) {
        Author author1 = new Author();
        Author author2 = new Author();
        author1.setName("брюс");
        author1.setSur_name("кропер");
        author2.setName("михаил");
        author2.setSur_name("кравишин");
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setAuthor(author1);
        book1.setTitle("роза");
        book1.setYers(1990);
        book2.setAuthor(author2);
        book2.setTitle("ветер");
        book2.setYers(1800);
        // вывод названия,год,фамилия,имя

        System.out.println(book1.getinfo());
        System.out.println(book2.getinfo());










    }


}






