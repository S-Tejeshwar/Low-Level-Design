public class IplTeam implements Bidder{

    String name;
    String playerName;
    AuctionMediator auctionMediator;
    public IplTeam(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(String playerName,int bidAmount) {
        this.playerName = playerName;
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void recieveNotification(String name, String playerName, int price) {
      System.out.println(this.name + " this to inform you that " + name + " has placed a bid of " + price
      + " for " + playerName);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPlayerName() {
        return this.playerName;
    }
}
