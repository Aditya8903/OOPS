package HashMap;

public class HashCodeEg {
    public static void main(String[] args) {
        String name = "Aditya";
        String name2 = "Aditya";
        Integer roll = 109;
        int code1 = name.hashCode();
        int code3 = name2.hashCode();
        int code2 = roll.hashCode();
        System.out.println(code1);
        System.out.println(code2);
        System.out.println(code3);
    }
}
