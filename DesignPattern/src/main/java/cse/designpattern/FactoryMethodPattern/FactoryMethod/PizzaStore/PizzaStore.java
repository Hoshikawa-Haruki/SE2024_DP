/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.FactoryMethodPattern.FactoryMethod.PizzaStore;

import cse.designpattern.FactoryMethodPattern.FactoryMethod.Pizza;

/**
 *
 * @author 이승환
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type); // 팩토리 메서드. 서브클래스에서 객체 생성을 책임져야 함

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);
        System.out.println("---Making a " + pizza.getName() + "---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.deliver();
        return pizza;
    }

}
