package sprint3Tasca_S302Nivel1.Builder;

import sprint3Tasca_S302Nivel1.Dough;
import sprint3Tasca_S302Nivel1.Pizza;
import sprint3Tasca_S302Nivel1.Toppings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: HawaiianPizzaBuilder
 * Package: sprint3Tasca_S302Nivel1.Builder
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 15:55
 * Version:v1.0
 */
public class HawaiianPizzaBuilder implements PizzaBuilder {
    private int size;
    private Dough dough;
    private List <Toppings> toppings = new ArrayList<>();

    //A Hawaiian Pizza using the core ingredients
    public HawaiianPizzaBuilder() {
        toppings.addAll(Arrays.asList(Toppings.HAM,Toppings.PINEAPPLE,Toppings.CHEESE));
    }

    @Override
    public PizzaBuilder buildSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder buildDough(Dough dough){
        this.dough = dough;
        return this;
    }
    //Selected optional toppings
    @Override
    public PizzaBuilder addTopping(Toppings topping) {
        toppings.add(topping);
        return this;
    }

    @Override
    public Pizza getResult() {
        return new Pizza(size,dough,new ArrayList<>(toppings));
    }

    @Override
    public void clear() {
        toppings.clear();
        size = 0;
        dough = null;
        toppings.addAll(Arrays.asList(Toppings.HAM,Toppings.PINEAPPLE,Toppings.CHEESE));
    }
}
