package OOPSproperties.Interfaces.ExtendInterfaces;

public interface B extends A{
    default void greet(){
        System.out.println("This is default greet method in B");
    }
}
