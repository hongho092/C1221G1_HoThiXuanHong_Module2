package ss10_array_linked_list.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements [];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("capacity: "+capacity);
        }
    }

    private void ensureCapa(int minCapa) {
        if (minCapa > 0) {
            int newSize = elements.length + minCapa;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IndexOutOfBoundsException("minCapa: "+minCapa);
        }
    }

    public void add (int index, E element) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("index: "+ index);
        } else if (elements.length == size) {
            ensureCapa(1);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i=size+1; i>=index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index){
        if (index<0 || index>elements.length){
            throw new IllegalArgumentException("Err index: " + index);
        }
        E element = (E) elements[index];
        for (int i=index; i<size-1; i++){
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size(){
        return this.size;
    }

    public int indexOf(E o){
        int index = -1;
        for (int i=0; i<size; i++){
            if (this.elements[i].equals(o)){
                return i;
            }
        }
        return index;
    }

    public E get(int index){
        return (E) elements[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
