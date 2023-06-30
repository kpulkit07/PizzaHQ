package com.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AllPizzas {
    private WebElement pizzaElements;
    static WebDriver driver;

    public ArrayList<Pizzas> allPizzaNames() {
        List<WebElement> pizzaElement = driver.findElements(By.className("pizza"));
        ArrayList<Pizzas> pizzas = new ArrayList<Pizzas>();

        for (WebElement pizzaElements : pizzaElement) {
            pizzas.add(new Pizzas(pizzaElements));
        }
        return pizzas;
    }

    public Pizzas getPizza(Predicate<Pizzas> strategy){
        for(Pizzas pizzas: allPizzaNames()){
            if(strategy.test(pizzas)){
                return pizzas;
            }
        }
        return null;
    }
}