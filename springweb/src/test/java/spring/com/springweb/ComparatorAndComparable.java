package spring.com.springweb;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class ComparatorAndComparable
{
    List<Book> listOfBooks = new ArrayList<>();
    public static void main(String [] ar)
    {
        List<MyBook> listOfBooks = new ArrayList<>();
        listOfBooks.add(new MyBook("Effective Java", "Joshua Bloch", 32));
        listOfBooks.add(new MyBook("Java Puzzlers", "Joshua Bloch", 22));
        //listOfBooks.add(null);
        listOfBooks.add(new MyBook("Java Concurrency in Practice", "Brian Goetz", 42));
        //listOfBooks.add(null);
        listOfBooks.add(new MyBook("Java SE 8 for Really Impatient", "Cay S. Horstmann", 34));
        listOfBooks.add(new MyBook("Core Java", "Cay S. Horstmann",32));

        Comparator<MyBook> byAuthor = (t1, t2) -> {
            return Integer.toString(t1.getPrice()).compareTo(Integer.toString(t2.getPrice()));
        };
        //listOfBooks.sort(byAuthor);
        Collections.sort(listOfBooks, byAuthor);
        System.out.println("list of books after sorting: " + listOfBooks);
        //Comparator<Book> byAuthor1 = Comparator.comparing(Book::getAuthor);

        LocalDate.now(ZoneId.systemDefault());
        Date d = new Date();

        System.out.println(LocalDate.now(ZoneId.systemDefault()));
        System.out.println(new Date());

    }

}