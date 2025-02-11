import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements  Mediator {
    private List<Colleague> colleagueList;

    public AuctionMediator() {
        this.colleagueList = new ArrayList<>();
    }

    @Override
    public void addBidder(Colleague colleague) {
        colleagueList.add(colleague);
    }

    @Override
    public void placeBid(Colleague colleague, int bidAmount) {
        for(Colleague c: colleagueList) {
            if(!(c.getName().equals(colleague.getName()))) {
                c.receiveNotification(colleague.getName(), bidAmount);
            }
        }
    }
}
