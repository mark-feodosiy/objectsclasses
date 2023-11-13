public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Александр",  "Пушкин");
        Author author2 = new Author("Лев",  "Толстой");
        Book book1 = new Book ("Сказка о рыбаке и рыбке", author1, 1833);
        Book book2 = new Book ("Война и мир", author2, 1867);
        Book book3 = new Book ("Сказка о рыбаке и рыбке", author1, 1833);


        System.out.println("Название книги: " + book1.getTitle());
        System.out.println("Год публикации - " + book1.getYear());
        System.out.println("Автор: " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println();
        System.out.println("Название книги: " + book2.getTitle());
        System.out.println("Год публикации - " + book2.getYear());
        System.out.println("Автор: " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());

        book2.setYear(1869);
        System.out.println("Год публикации - " + book2.getYear());


        System.out.println();
        System.out.println(book1);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}

