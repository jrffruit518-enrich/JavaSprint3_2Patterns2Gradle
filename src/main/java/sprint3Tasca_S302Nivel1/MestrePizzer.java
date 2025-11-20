package sprint3Tasca_S302Nivel1;

import sprint3Tasca_S302Nivel1.Builder.PizzaBuilder;



/**
 * ClassName: MestrePizzer
 * Package: sprint3Tasca_S302Nivel1
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 15:49
 * Version:v1.0
 */
public class MestrePizzer {
    private PizzaBuilder pizzaBuilder;

    public MestrePizzer(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza buildPizza(int size, Dough dough, Toppings... extraToppings) {
        this.pizzaBuilder.buildSize(size).buildDough(dough);
        for (Toppings topping : extraToppings) {
           this.pizzaBuilder.addTopping(topping);
        }
        return this.pizzaBuilder.getResult();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }


    public void clearBuilder() {
        this.pizzaBuilder.clear();
    }
}
