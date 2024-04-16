package staticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(21, "Aditya", 100000,false);
        System.out.println(h1.name);
        Human h2 = new Human(21, "Oditya", 101000,false);
        System.out.println(h2.name);
        System.out.println(Human.pop);
        // System.out.println(h2.pop);
        greet();
        Main obj = new Main();
        obj.gree2t();
    }

    static void greet(){
        System.out.println("OLA");
    } 
    void gree2t(){
        System.out.println("OLA2");
    } 
}
