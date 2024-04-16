package OOPSproperties.Interfaces;

public class Car implements Engine,Brake,Media {
    int car = 180;

    @Override
    public void play() {
        System.out.println("PLAY");
    }

    @Override
    public void pause() {
        System.out.println("PAUSE");
    }

    @Override
    public void brake() {
        System.out.println("BRAKE");
    }

    @Override
    public void start() {
        System.out.println("START");
    }

    @Override
    public void stop() {
        System.out.println("STOP");
    }

    @Override
    public void accelerate() {
        System.out.println("ACCELERATE");
    }
}
