package sprint3Tasca_S302Nivel1.Builder;

import sprint3Tasca_S302Nivel1.Dough;
import sprint3Tasca_S302Nivel1.Pizza;
import sprint3Tasca_S302Nivel1.Toppings;

/**
 * ClassName: PizzaBuilder
 * Package: sprint3Tasca_S302Nivel1
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 15:51
 * Version:v1.0
 */
public interface PizzaBuilder {
    public PizzaBuilder buildSize(int size);
    public PizzaBuilder buildDough(Dough dough);
    //Selected optional toppings
    public PizzaBuilder addTopping(Toppings topping); //for client add extra toppings
    public Pizza getResult();
    public void clear();
}
