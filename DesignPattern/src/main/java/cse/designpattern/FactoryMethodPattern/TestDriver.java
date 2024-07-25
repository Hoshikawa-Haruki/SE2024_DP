/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.FactoryMethodPattern;

/**
 *
 * @author 이승환
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza pizza1 = store.orderPizza("cheese");
        System.out.println(pizza1);

        Pizza pizza2 = store.orderPizza("greek");
        System.out.println(pizza2);

        Pizza pizza3 = store.orderPizza("pepperoni");
        System.out.println(pizza3);
    }

}
