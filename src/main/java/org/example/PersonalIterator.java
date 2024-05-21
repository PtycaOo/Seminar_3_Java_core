package org.example;

import java.util.Iterator;
import java.util.List;

public class PersonalIterator<P> implements Iterator<Personal> {
    private int index = 0;
    private List<Personal> list;

    public PersonalIterator(List<Personal> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Personal next() {
        return list.get(index++);
    }
}
