package Generics;

import java.util.Arrays;

public class GenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    //when object of CustomArrayList this creates the array of default size 
    public GenericArrayList() {
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
        GenericArrayList<Integer> l1 = new GenericArrayList<>();
        l1.add(100);
        System.out.println(l1);
        // l1.add("Aditya"); ->ERROR
        GenericArrayList<String> l2 = new GenericArrayList<>();
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        l2.add("Aditya");
        System.out.println(l2);
    }
}
