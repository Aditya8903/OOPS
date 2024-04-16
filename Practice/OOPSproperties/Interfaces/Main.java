package OOPSproperties.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate();
        c.brake();
        c.pause();
        c.play();
        c.start();
        c.stop();
        System.out.println(c.car);
        // System.out.println(c.engine); ->not good practice
        System.out.println(Engine.engine);
        Engine c2= new Car();
        // System.out.println(c2.car); This gives error as ref is of Engine hence can not access var. of car
        // System.out.println(c2.engine);->not good practice
        System.out.println(Engine.engine);
        c2.start();
        Media c3 = new Car();
        c3.start();

        NiceCar nc = new NiceCar();
        nc.start();
        nc.startMusic();



    }
}
