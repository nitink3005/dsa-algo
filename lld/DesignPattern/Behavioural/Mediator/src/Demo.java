public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Mediator ----");
        AuctionMediator auctionMediator = new AuctionMediator();
        Colleague c1 = new ConcreteColleague("nitin", auctionMediator);
        Colleague c2 = new ConcreteColleague("salman", auctionMediator);
        Colleague c3 = new ConcreteColleague("sharukh", auctionMediator);
        c1.placeBid(300);
        c2.placeBid(500);
        c3.placeBid(600);
    }
}
