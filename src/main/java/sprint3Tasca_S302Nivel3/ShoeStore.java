package sprint3Tasca_S302Nivel3;

import sprint3Tasca_S302Nivel3.PaymentMethod.PaymentMethod;

public class ShoeStore implements PaymentCallback{
    private PaymentGateway paymentGateway;

    public ShoeStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(PaymentMethod method, double price) {
        System.out.println("The shoe store is processing the purchase.");
        paymentGateway.payment(method,price,this);
    }

    @Override
    public void onPaymentSuccess() {
        System.out.println("The payment is successful. The goods can be delivered");
    }

    @Override
    public void onPaymentFailed() {
        System.out.println("The payment is failed. The goods can't be delivered");
    }
}
