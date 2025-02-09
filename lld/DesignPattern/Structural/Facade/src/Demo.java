public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Facade Pattern ----");

        DvDPlayer dvDPlayer = new DvDPlayer();
        Projector projector = new Projector();
        Speakers speakers = new Speakers();
        Amplifier amplifier = new Amplifier();
        HomeTheater homeTheater = new HomeTheater(dvDPlayer, projector, speakers, amplifier);
        homeTheater.watchMovie("Andhadhun");
        homeTheater.endMovie();
    }
}
