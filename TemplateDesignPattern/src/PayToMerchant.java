public class PayToMerchant extends PaymentTemplate{

    @Override
    public void validateRequest() {
        System.out.println("Payment to merchant request validated");
    }

    @Override
    public void debitAmount() {
        System.out.println("Amount debited to pay merchant");
    }

    @Override
    public void charges() {
        System.out.println("Amount credited in merchant's account");
    }

    @Override
    public void creditAmount() {

    }
}
