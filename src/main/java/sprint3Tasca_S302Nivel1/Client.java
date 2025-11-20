package sprint3Tasca_S302Nivel1;

import sprint3Tasca_S302Nivel1.Builder.HawaiianPizzaBuilder;
import sprint3Tasca_S302Nivel1.Builder.VeggiePizzaBuilder;


/**
 * ClassName: Client
 * Package: sprint3Tasca_S302Nivel1
 * Description:
 * Author: Rong Jiang
 * Create:16/11/2025 - 18:14
 * Version:v1.0
 */
public class Client {
    public static void main(String[] args) {

        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        MestrePizzer mestrePizzer = new MestrePizzer(hawaiianPizzaBuilder);

        Pizza pizza = mestrePizzer.buildPizza(15,Dough.THICK,Toppings.CHEESE);// client add extra cheese

        Pizza pizza1 =mestrePizzer.buildPizza(18,Dough.THIN,Toppings.HAM); // client add extra cheese and ham

        mestrePizzer.clearBuilder(); // remove extra cheese and ham
        Pizza pizza2 = mestrePizzer.buildPizza(21,Dough.HAND_TOSSED,Toppings.OLIVES,Toppings.MUSHROOMS); // client add extra olives and mushrooms

        VeggiePizzaBuilder veggiePizzaBuilder = new VeggiePizzaBuilder();
        mestrePizzer.setPizzaBuilder(veggiePizzaBuilder);
        Pizza pizza3 = mestrePizzer.buildPizza(25,Dough.THICK,Toppings.PEPPERONI);// client add extra pepperoni

        System.out.println(pizza);
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
