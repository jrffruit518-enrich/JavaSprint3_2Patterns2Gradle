package sprint3Tasca_S302Nivel2.observer;

import sprint3Tasca_S302Nivel2.Broker;
import sprint3Tasca_S302Nivel2.StockState;
import sprint3Tasca_S302Nivel2.Subject;

/**
 * ClassName: BrokerageFirm
 * Package: sprint3Tasca_S302Nivel2.observer
 * Description:
 * Author: Rong Jiang
 * Create:17/11/2025 - 21:06
 * Version:v1.0
 */
public class BrokerageFirm implements Observer{
    private int stockIndex;
    private StockState stockState;

    @Override
    public void updatePull(Subject subject) {
        if (subject instanceof Broker broker) {
            this.stockIndex = broker.getStockIndex();
            display();
        }
    }

    public void display() {
        System.out.println("BrokerageFirm : The stock index now is " + stockIndex);
        System.out.println();
    }

    @Override
    public void updatePush(StockState stockState, int stockIndex) {

    }
}
