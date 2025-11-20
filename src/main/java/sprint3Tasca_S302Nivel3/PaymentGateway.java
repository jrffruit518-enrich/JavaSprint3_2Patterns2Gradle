package sprint3Tasca_S302Nivel3;

import sprint3Tasca_S302Nivel3.PaymentMethod.PaymentMethod;

public class PaymentGateway {
    public void payment(PaymentMethod paymentMethod, double amount,PaymentCallback callback) {
        paymentMethod.pay(amount,callback);
    }
}
