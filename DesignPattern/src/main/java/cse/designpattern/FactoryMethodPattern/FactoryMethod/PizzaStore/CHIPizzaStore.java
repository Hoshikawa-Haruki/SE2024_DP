/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.FactoryMethodPattern.FactoryMethod.PizzaStore;

import cse.designpattern.FactoryMethodPattern.FactoryMethod.CHIStyleCheesePizza;
import cse.designpattern.FactoryMethodPattern.FactoryMethod.CHIStyleVeggiePizza;
import cse.designpattern.FactoryMethodPattern.FactoryMethod.Pizza;

/**
 *
 * @author 이승환
 */
public class CHIPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CHIStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CHIStyleVeggiePizza();
        } else {
            return null;
        }
    }

}
