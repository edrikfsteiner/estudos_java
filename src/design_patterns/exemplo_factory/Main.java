package design_patterns.exemplo_factory;

import design_patterns.exemplo_factory.factory.RestauranteFactory;
import design_patterns.exemplo_factory.product.Pizza;

public class Main {
    public static void main(String[] args) {
        RestauranteFactory restauranteFactory = new RestauranteFactory();
        Pizza pizzaCalabresa = restauranteFactory.prepararPizza("calabresa");
        Pizza pizzaFrango = restauranteFactory.prepararPizza("frango");

        System.out.println(pizzaCalabresa.toString());
        System.out.println(pizzaFrango.toString());
    }
}