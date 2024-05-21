package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class Office implements Iterable<Personal>{
    private final ArrayList<Personal> arr;

    public Office() {
        arr = new ArrayList<>();
    }

    public void addPersonal(Personal personal){
        arr.add(personal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список сотрудников:\n");
        for (Personal personal: arr){
            sb.append(personal.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @NotNull
    @Override
    public Iterator<Personal> iterator() {
        return new PersonalIterator<Personal>(arr);
    }
}
