package sprint3Tasca_S302Nivel2.observer;

import sprint3Tasca_S302Nivel2.StockState;
import sprint3Tasca_S302Nivel2.Subject;

/**
 * ClassName: Observer
 * Package: sprint3Tasca_S302Nivel2.observer
 * Description:
 * Author: Rong Jiang
 * Create:17/11/2025 - 21:01
 * Version:v1.0
 */
public interface Observer {
 //Interfaz utilizado únicamente para demostrar la implementación de los todos push y pull
 public void updatePush(StockState stockState,int stockIndex);
 public void updatePull(Subject subject);
}
