package staticExample;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;
    static long pop;

    public Human(int age,String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married =married;
        Human.pop = pop+1;
    }
}
