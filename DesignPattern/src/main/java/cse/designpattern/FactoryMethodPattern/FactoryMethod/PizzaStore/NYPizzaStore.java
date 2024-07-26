/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.FactoryMethodPattern.FactoryMethod.PizzaStore;

import cse.designpattern.FactoryMethodPattern.FactoryMethod.NYStyleCheesePizza;
import cse.designpattern.FactoryMethodPattern.FactoryMethod.NYStyleVeggiePizza;
import cse.designpattern.FactoryMethodPattern.FactoryMethod.Pizza;

/**
 *
 * @author 이승환
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
