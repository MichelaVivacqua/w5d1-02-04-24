package michelavivacqua.w5d1020424;

import michelavivacqua.w5d1020424.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class W5d1020424Application {

	public static void main(String[] args) {
		SpringApplication.run(W5d1020424Application.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Menu menu = context.getBean(Menu.class);

		System.out.println("Pizze nel menù:");
		for (Pizza pizza : menu.getPizzas()) {
			System.out.println(pizza.getName() + " - " + pizza.getPrice());
			System.out.print("Toppings: ");
			for (Topping topping : pizza.getToppings()) {
				System.out.print(topping.getName() + ", ");
			}
			System.out.println();
		}

		System.out.println("Bevande nel menù:");
		for (Drink drink : menu.getDrinks()) {
			System.out.println(drink.getName() + " - " + drink.getPrice());
		}
	}

}


