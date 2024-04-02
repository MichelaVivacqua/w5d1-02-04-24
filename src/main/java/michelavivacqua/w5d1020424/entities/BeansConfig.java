package michelavivacqua.w5d1020424.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {

    public Pizza margherita(Topping prosciutto, Topping ananas) {
        Pizza pizza = new Pizza("Margherita", 7.99, Arrays.asList(prosciutto, ananas));
        return pizza;
    }

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto");
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas");
    }

    @Bean
    public Menu menu(List<Pizza> pizzas, List<Drink> drinks) {
        return new Menu(pizzas, drinks);
    }
}

