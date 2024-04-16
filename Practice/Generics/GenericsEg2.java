package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEg2 {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(20);
        list.add(20.3f);
        System.out.println(list);
        List list2 = new ArrayList<>();
        list2.add(200);
        System.out.println(list2);
    }
}