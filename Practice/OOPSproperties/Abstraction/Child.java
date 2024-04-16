package OOPSproperties.Abstraction;

public class Child extends Parent{

    @Override
    public void carrer(String name) {
        System.out.println("I want  to be a "+name);
    }

    @Override
    public void partner(String name) {
        System.out.println("I love "+name);
    }
    
}
