package com.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pizzas {
    private final WebElement pizzaElements;
    public Pizzas(WebElement pizzaElements) {
        this.pizzaElements = pizzaElements;
    }
    public String getName(){
        return pizzaElements.findElement(By.className("name")).getText();
    }
}
