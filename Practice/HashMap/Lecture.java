package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Lecture {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Aditya", 109);
        map.put("Himanchu", 110);
        System.out.println(map.get("Aditya"));
        System.out.println(map.get("Oditya"));
        System.out.println(map.getOrDefault("Oaditya", 100));
        System.out.println(map.containsKey("Aditya"));

        /*HashSet */
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(506);
        set.add(1156);
        set.add(56);
        set.add(560);
        set.add(5600);
        System.out.println(set);
    }
}
