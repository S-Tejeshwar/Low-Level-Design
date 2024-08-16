public interface Bidder {

    public void placeBid(String playerName, int bidAmount);
    public void recieveNotification(String name, String playerName, int price);
    String getName();
    String getPlayerName();
}
