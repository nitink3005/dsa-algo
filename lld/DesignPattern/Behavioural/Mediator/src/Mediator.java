public interface Mediator {
     void addBidder(Colleague colleague);
     void placeBid(Colleague colleague, int bidAmount);
}
