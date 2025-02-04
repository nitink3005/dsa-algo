public class Demo {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern");
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Sanam re");
        audioPlayer.play("mp4", "pushpa2.mp4");
        audioPlayer.play("vlc", "republic-day.mkv");
        audioPlayer.play("avi", "some.mkv");
    }
}
