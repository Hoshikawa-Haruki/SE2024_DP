/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.FactoryMethod.SimpleFactory;

/**
 *
 * @author 이승환
 */
public class PizzaStore {

    private SimplePizzaFactory factory; // 먼저 생성됨 (피자스토어 생성자 보다)

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory; // 연관에 의한 초기화
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
