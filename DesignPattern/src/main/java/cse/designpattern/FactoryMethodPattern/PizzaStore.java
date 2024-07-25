/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.FactoryMethodPattern;

/**
 *
 * @author 이승환
 */
public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            // 더 이상 그릭피자를 생산하지 않는다면? (지워야 함)
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        // clam pizza와 veggie pizza를 생산해야 한다면? -> else if 문으로 추가
        // 구현에 대해 프로그래밍하여 코드 변경에 대해 닫혀 있지 않음.
        // pizza가 제대로 생성되지 않으면?
        // -> Null pointer dereference (널 포인터 역참조)
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }

}
