package org.example.task4;

import java.util.ArrayList;
import java.util.List;

public class LRUCache<T> {
    private int size;
    private ArrayList<T> elements;

    public LRUCache(int size) {
        this.size = size;
        elements = new ArrayList<>();
    }

    public void addElement(T item) {
        if (elements.size() == size) {
            elements.remove(0);
        }
        elements.add(item);
    }

    public T getElement(int index){
        return elements.get(index);
    }

    public List<T> getAllElement(){
        return elements;
    }
}
