package sprint3Tasca_S302Nivel2;

import sprint3Tasca_S302Nivel2.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Broker
 * Package: sprint3Tasca_S302Nivel2.observer
 * Description:
 * Author: Rong Jiang
 * Create:17/11/2025 - 21:32
 * Version:v1.0
 */
public class Broker implements Subject {
    private StockState stockState;
    private int stockIndex;
    private List <Observer> observers;

    public Broker(StockState stockState, int stockIndex) {
        this.stockState = stockState;
        this.stockIndex = stockIndex;
        this.observers = new ArrayList<>();
    }

    public StockState getStockState() {
        return stockState;
    }

    public int getStockIndex() {
        return stockIndex;
    }

    public List<Observer> getObservers() {
        return new ArrayList<>(observers);
    }

    @Override
    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserversPush() {
     observers.forEach(observer -> observer.updatePush(this.stockState ,this.stockIndex));
    }

    @Override
    public void notifyObserversPull() {
        observers.forEach(observer -> observer.updatePull(this));
    }

    public void setData(StockState stockState, int stockIndex) {
        if (this.stockState != stockState || this.stockIndex != stockIndex) {
            this.stockState = stockState;
            this.stockIndex = stockIndex;
            notifyObserversPush();
            notifyObserversPull();
        }
    }
}
