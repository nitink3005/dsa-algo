public class ExpertSupportHandler extends SupportHandler {
    public ExpertSupportHandler(int level) {
        super(level);
    }

    @Override
    public void handle(String message) {
        System.out.println("Expert support handler: " + message);
    }
}
