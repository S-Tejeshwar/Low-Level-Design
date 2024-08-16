public interface AuctionMediator {

    public void addBidder(Bidder bidder);
    public void placeBid(Bidder bidder, int bidAmount);
}
