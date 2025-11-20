package sprint3Tasca_S302Nivel3;

import sprint3Tasca_S302Nivel3.PaymentMethod.BankAccountPay;
import sprint3Tasca_S302Nivel3.PaymentMethod.PayPal;
import sprint3Tasca_S302Nivel3.PaymentMethod.PaymentMethod;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PayPal();
        ShoeStore shoeStore = new ShoeStore(new PaymentGateway());
        shoeStore.checkout(paymentMethod,500);
        System.out.println();

        PaymentMethod paymentMethod1 = new BankAccountPay();
        shoeStore.checkout(paymentMethod1,-100);
    }
}
