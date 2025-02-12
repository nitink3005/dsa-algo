public class FanOnState extends State {
    private Fan fan;
    public FanOnState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Fan is in On State");
        System.out.println("Setting Fan to off State....");
        fan.setState(fan.getFanOffState());
    }
}
