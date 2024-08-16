public class PayToFriend extends PaymentTemplate{


    @Override
    public void validateRequest() {
        System.out.println("Payment for friend request validated");
    }

    @Override
    public void debitAmount() {
        System.out.println("Amount debited to pay friend");
    }

    @Override
    public void charges() {
        System.out.println("No charges");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount credited in friend's account");
    }
}
