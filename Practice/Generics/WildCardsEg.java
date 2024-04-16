package Generics;

import java.util.Arrays;
//T can be Number or its subclass like Integer , Float , Long
public class WildCardsEg<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    //when object of CustomArrayList this creates the array of default size 
    public WildCardsEg() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args) {
        WildCardsEg<Integer> l1= new WildCardsEg<>();
        l1.add(10);
        WildCardsEg<Float> l2= new WildCardsEg<>();
        l2.add(10.2f);
        // WildCardsEg<String> l3= new WildCardsEg<>(); -> ERROR
        System.out.println(l1);
        System.out.println(l2);
    }
}
