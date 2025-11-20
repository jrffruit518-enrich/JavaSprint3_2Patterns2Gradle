package sprint3Tasca_S302Nivel2;

import sprint3Tasca_S302Nivel2.observer.Observer;

/**
 *ClassName: Subject
 *Package: sprint3Tasca_S302Nivel2
 *Description:
 *Author: Rong Jiang
 *Create:17/11/2025 - 21:27
 *Version:v1.0
*
*/
public interface Subject {
   //Interfaz utilizado únicamente para demostrar la implementación de los todos push y pull
   public void register(Observer observer);
   public void remove(Observer observer);
   public void notifyObserversPush();
   public void notifyObserversPull();
}
