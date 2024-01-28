package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements Aggregate{
    public Library(List<Books> list) {
        this.list = list;
    }

    List<Books> list = new ArrayList<>();
    @Override
    public BooksIterator getIterator() {
        return new BooksIterator(list);
    }
}
