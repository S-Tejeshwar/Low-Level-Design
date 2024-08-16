public abstract class PaymentTemplate {

    public abstract void validateRequest();
    public abstract void debitAmount();
    public abstract void charges();
    public abstract void creditAmount();

    public final void sendMoney() {
        validateRequest();
        debitAmount();
        charges();
        creditAmount();
    }
}
