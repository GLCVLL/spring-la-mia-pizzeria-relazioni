package org.java.spring;

import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PizzaService pizzaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception{
        pizzaService.save(new Pizza("Margherita", "Classica pizza margherita", "url_margherita", 8.99f));
        pizzaService.save(new Pizza("Pepperoni", "Pizza con pepperoni piccanti", "url_pepperoni", 9.99f));
        pizzaService.save(new Pizza("Quattro Formaggi", "Pizza con quattro tipi di formaggio", "url_quattro_formaggi", 10.99f));
        pizzaService.save(new Pizza("Vegetariana", "Pizza vegetariana con verdure fresche", "url_vegetariana", 9.49f));
        pizzaService.save(new Pizza("Capricciosa", "Pizza con prosciutto, funghi e carciofi", "url_capricciosa", 11.49f));
	}
}
