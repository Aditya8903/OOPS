package CollectionFrameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        arrayList.add(10);
        linkedList.add(20);
        vector.add(3);
        System.out.println(arrayList);
        System.out.println(vector);
        System.out.println(linkedList);
    }
}
