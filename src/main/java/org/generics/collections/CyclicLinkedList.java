package org.generics.collections;

import java.util.*;

public class CyclicLinkedList<T> extends LinkedList<T> {

    private int indexCyclid = 0;

    public CyclicLinkedList() {
    }


    @Override
    public T get(int index) {
        int newIndex = (indexCyclid + index) % size();
        indexCyclid = newIndex;
        return super.get(newIndex);
    }

    @Override
    public T peek(){
        return super.get(indexCyclid);
    }
}
