import java.util.ArrayList;
import java.util.List;

public class IPLAuctioner implements AuctionMediator{

    List<Bidder> bidders = new ArrayList<>();


    @Override
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int bidAmount) {
      for (Bidder bidder1: bidders) {
          if ( !bidder1.getName().equals(bidder.getName()) ) {
              bidder1.recieveNotification(bidder.getName(), bidder.getPlayerName(), bidAmount);
          }
      }
    }
}
