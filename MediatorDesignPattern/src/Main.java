public class Main {
    public static void main(String[] args) {
       AuctionMediator auctionMediator = new IPLAuctioner();
       Bidder csk = new IplTeam("CSK", auctionMediator);
       Bidder rcb = new IplTeam("RCB", auctionMediator);
       Bidder kkr = new IplTeam("KKR", auctionMediator);

       csk.placeBid("DHONI", 6000000);
       rcb.placeBid("VIRAT", 6000000);
    }
}