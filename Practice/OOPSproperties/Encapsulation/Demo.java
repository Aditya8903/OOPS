package OOPSproperties.Encapsulation;

public class Demo {
    public static void main(String[] args) {
        Human1 h1 = new Human1();
        // System.out.println(h1.name); -> Error as class is in other world
        // But we can access the method 
        /*So here we binded data with methods hence called encapsulation */
        System.out.println(h1.getAge());
        System.out.println(h1.getName());

        h1.setAge(100);
        System.out.println(h1.getAge());
        Human2 h2 = new Human2();
        h2.age = 10;
        h2.name = "Oditya";
        System.out.println(h2.age);
        System.out.println(h2.name);
    }

    static class Human2{
        private  int age ;
        private String name ;
        private String title;
        
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        
    }
}
class Human1{
    private int age = 21;
    private String name = "Aditya";

    public int getAge(){
        System.out.print("Hi my age is  -> ");
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
}