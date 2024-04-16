package OOPSproperties.Interfaces.ExtendInterfaces;

public class Use implements B{
    public void fun(){
        System.out.println("Fun method of A in Use class");
    }
    public void greet(){
        B.super.greet();
        System.out.println("Greet in use class");
    }
}
