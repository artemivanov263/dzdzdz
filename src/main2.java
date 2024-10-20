public class main2 {

    public static void main(String[] args) {
        Author author1 = new Author("вадим","касеренко");
        Author author2 = new Author("лилия", "грейс");
        Book book1 = new Book("война миров",1743,author1 );
        Book book2 = new Book("история ходов",1932,author2);





       book1.setTitle("визит в никуда");
       book1.setYers(1923);
       author2.setName("катерина","вавилова");
        System.out.println(author1.getAuthorName());
        System.out.println(author2.getAuthorName());
        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        System.out.println(book1.getYers());
        System.out.println(book2.getYers());
        System.out.println(book1.getAuthor());
        System.out.println(book2.getAuthor());














    }


}






