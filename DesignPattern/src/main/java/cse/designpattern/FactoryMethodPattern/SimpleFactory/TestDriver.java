/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.FactoryMethodPattern.SimpleFactory;

/**
 *
 * @author 이승환
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza1 = store.orderPizza("cheese");
        System.out.println("이승환의 주문 " + pizza1);

        Pizza pizza2 = store.orderPizza("greek");
        System.out.println("이경민의 주문 " + pizza2);

        Pizza pizza3 = store.orderPizza("clam");
        System.out.println("하루키의 주문 " + pizza3);
    }

}
