public abstract class SupportHandler {
    public static int BASIC = 1;
    public static int TECHNICAL = 2;
    public static int EXPERT = 3;

    private int level;

    public SupportHandler(int level) {
        this.level = level;
    }

    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(int level, String message) {
        if(this.level == level) {
            handle(message);
        }
        if(nextHandler!=null) {
            nextHandler.handleRequest(level, message);
        }
    }

    public abstract void handle(String message);
}
