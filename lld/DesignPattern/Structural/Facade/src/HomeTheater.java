public class HomeTheater {
   private DvDPlayer dvDPlayer;
   private Projector projector;
   private Speakers speakers;
   private Amplifier amplifier;

    public HomeTheater(DvDPlayer dvDPlayer, Projector projector, Speakers speakers, Amplifier amplifier) {
        this.dvDPlayer = dvDPlayer;
        this.projector = projector;
        this.speakers = speakers;
        this.amplifier = amplifier;
    }

    public void watchMovie(String movie) {
        System.out.println("----- Get ready to watch movie... ------");
        projector.on();
        projector.wideSreen();
        amplifier.on();
        amplifier.setVolume(5);
        speakers.on();
        dvDPlayer.on();
        dvDPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("---- Shutting down movie theater... -----");
        projector.off();
        amplifier.off();
        speakers.off();
        dvDPlayer.stop();
        dvDPlayer.eject();
        dvDPlayer.off();
    }
}
