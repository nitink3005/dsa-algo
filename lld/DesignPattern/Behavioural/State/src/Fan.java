public class Fan {
    private State fanOffState;
    private State fanOnState;
    private State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanOnState = new FanOnState(this);
        state = fanOffState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanOnState() {
        return fanOnState;
    }

    public void pullChain() {
        state.handleRequest();
    }
}
