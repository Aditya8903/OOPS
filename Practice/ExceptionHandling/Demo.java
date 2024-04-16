package ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        // Main m = new Main();
        // m.divide(10, 20); -> no preffered as divide is static
        Main.divide(10, 20);
        Main.divide(10, 0);
    }
}
