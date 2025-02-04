public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advMusicPlayer;
    public MediaAdapter(String audioType) {
        if(audioType.equals("vlc")) {
            advMusicPlayer = new VlcPlayer();
        } else {
            advMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advMusicPlayer.playVlc(fileName);
        } else {
            advMusicPlayer.playMp4(fileName);
        }
    }
}
