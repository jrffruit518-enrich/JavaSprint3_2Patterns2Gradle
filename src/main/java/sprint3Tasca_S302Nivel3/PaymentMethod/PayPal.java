package sprint3Tasca_S302Nivel3.PaymentMethod;

import sprint3Tasca_S302Nivel3.PaymentCallback;

public class PayPal implements PaymentMethod {
    public void pay(double amount, PaymentCallback callback) {
        if (amount > 0) {
            System.out.println("Pay by paypal");
            callback.onPaymentSuccess();
        } else {
            callback.onPaymentFailed();
        }
    }
}