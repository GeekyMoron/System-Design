package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Books> book = new ArrayList<>();
        book.add(new Books(1,"dog"));
        book.add(new Books(2,"cat"));
        Library library = new Library(book);
        BooksIterator booksIterator = library.getIterator();
        while(booksIterator.hasNext()) {
            System.out.println(booksIterator.next().getName());
        }
    }
}
