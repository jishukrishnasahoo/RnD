package spring.com.springweb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable
{
    List<Book> listOfBooks = new ArrayList<>();
    public static void main(String [] ar)
    {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Effective Java", "Joshua Bloch", 32));
        listOfBooks.add(new Book("Java Puzzlers", "Joshua Bloch", 22));
        //listOfBooks.add(null);
        listOfBooks.add(new Book("Java Concurrency in Practice", "Brian Goetz", 42));
        //listOfBooks.add(null);
        listOfBooks.add(new Book("Java SE 8 for Really Impatient", "Cay S. Horstmann", 34));
        listOfBooks.add(new Book("Core Java", "Cay S. Horstmann",32));

        Comparator<Book> byAuthor = (t1, t2) -> {
            return Integer.toString(t1.getPrice()).compareTo(Integer.toString(t2.getPrice()));
        };
        //listOfBooks.sort(byAuthor);
        Collections.sort(listOfBooks, byAuthor);
        System.out.println("list of books after sorting: " + listOfBooks);
        //Comparator<Book> byAuthor1 = Comparator.comparing(Book::getAuthor);

    }

}