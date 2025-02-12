public class FanOffState extends State {
    private Fan fan;
    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Fan is in Off State");
        System.out.println("Setting Fan to On State....");
        fan.setState(fan.getFanOnState());
    }
}
