public class ConcreteColleague implements  Colleague {
    private String name;
    private Mediator auctionMediator;

    public ConcreteColleague(String name, Mediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(String bidderName, int bidAmount) {
        System.out.println("Person " + name + " notified : " + "Bidder " + bidderName + " has bid Amount of "+ bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
