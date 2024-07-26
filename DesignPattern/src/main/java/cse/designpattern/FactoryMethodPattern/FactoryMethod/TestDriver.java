/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.FactoryMethodPattern.FactoryMethod;

import cse.designpattern.FactoryMethodPattern.FactoryMethod.PizzaStore.CHIPizzaStore;
import cse.designpattern.FactoryMethodPattern.FactoryMethod.PizzaStore.NYPizzaStore;
import cse.designpattern.FactoryMethodPattern.FactoryMethod.PizzaStore.PizzaStore;

/**
 *
 * @author 이승환
 */
public class TestDriver {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chiStore = new CHIPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan 주문 " + pizza.getName() + "\n");

        pizza = chiStore.orderPizza("cheese");
        System.out.println("Joel 주문 " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan 주문 " + pizza.getName() + "\n");

        pizza = chiStore.orderPizza("veggie");
        System.out.println("Joel 주문 " + pizza.getName() + "\n");

    }

}
