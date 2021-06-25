package material.collections;


import java.util.HashMap;
import java.util.Objects;

class Book {
    String author;
    String name;
}

class Ticket {
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // ????????? ?? ?????? ? ?????? ???? ? ???? ?? ??? ??????
        if (o == null || getClass() != o.getClass()) return false; //  ????????? ?? ????? ??????
        Ticket ticket = (Ticket) o; // ?????????? ?????? ?? ????
        return number == ticket.number; // ????????? ?? ??????????. ??????????? ??? ?????????
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

public class Map extends Object {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Author";
        book.name = "Name";

        Ticket ticket1 = new Ticket();
        ticket1.number = 1;
        java.util.Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket1, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 1;

        Book book1 = library.get(ticket1);
        System.out.println(book1.author + " " + book1.name);

        Book book2 = library.get(ticket2);

        System.out.println(book1 == book2);

        System.out.println(book2.author + " " + book2.name); // false



    }
}
