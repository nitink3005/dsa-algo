public class BasicSupportHandler extends SupportHandler {
    public BasicSupportHandler(int level) {
        super(level);
    }

    @Override
    public void handle(String message) {
        System.out.println("Basic support handler: " + message);
    }
}
