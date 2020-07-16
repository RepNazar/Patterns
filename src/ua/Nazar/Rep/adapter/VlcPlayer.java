package ua.Nazar.Rep.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing file:" + fileName+ ".vlc");
    }

    @Override
    public void playMp4(String fileName) {
        //
    }
}
