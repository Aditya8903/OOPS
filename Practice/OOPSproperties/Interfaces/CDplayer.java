package OOPSproperties.Interfaces;

public class CDplayer implements Media {

    @Override
    public void play() {
        System.out.println("Play in media");
    }

    @Override
    public void pause() {
        System.out.println("Pause in media");
    }

    @Override
    public void start() {
        System.out.println("Start in media");
    }

    @Override
    public void stop() {
        System.out.println("Stop in media");
    }
    
}
