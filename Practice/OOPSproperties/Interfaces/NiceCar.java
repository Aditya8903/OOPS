package OOPSproperties.Interfaces;

public class NiceCar {
    private Engine eng;
    private Media player = new CDplayer();
    public NiceCar(){
        eng = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.eng = engine;
    }

    public void start(){
        eng.start();
    }

    public void startMusic(){
        player.start();
    } 

    public void upgradeEngine(){
        this.eng = new PowerEngine();
    }
}
