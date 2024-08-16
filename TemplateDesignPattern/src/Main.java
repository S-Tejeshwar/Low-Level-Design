public class Main {
    public static void main(String[] args) {
        PaymentTemplate payToFriend = new PayToFriend();
        payToFriend.sendMoney();

        PaymentTemplate payToMerchant = new PayToMerchant();
        payToMerchant.sendMoney();
    }
}