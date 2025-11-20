package sprint3Tasca_S302Nivel3.PaymentMethod;

import sprint3Tasca_S302Nivel3.PaymentCallback;

public interface PaymentMethod {
    public void pay(double amount, PaymentCallback callback);
}
