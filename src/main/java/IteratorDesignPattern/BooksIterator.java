package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BooksIterator implements Iterator{
    int index = 0;
    public BooksIterator(List<Books> list) {
        this.list = list;
    }

    List<Books> list = new ArrayList<>();
    @Override
    public boolean hasNext() {
        return index<list.size();
    }

    @Override
    public Books next() {
        if(hasNext()) {
            Books data = list.get(index);
            index++;
            return data;
        } else
            return null;
    }
}
