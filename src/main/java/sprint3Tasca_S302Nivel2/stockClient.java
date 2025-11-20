package sprint3Tasca_S302Nivel2;

import sprint3Tasca_S302Nivel2.observer.BrokerageFirm;
import sprint3Tasca_S302Nivel2.observer.Observer;
import sprint3Tasca_S302Nivel2.observer.StockAgency;

public class stockClient {
    public static void main(String[] args) {
        Observer observer = new StockAgency();
        Observer observer1 = new BrokerageFirm();
        Broker broker = new Broker(StockState.DOWN,3500);
        broker.register(observer);
        broker.register(observer1);
        broker.setData(StockState.UP,4100);
    }
}
