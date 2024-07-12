/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.FactoryMethod.SimpleFactory;

/**
 *
 * @author 이승환
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimplePizzaFactory factory = new SimplePizzaFactory(); // 피자스토어 보다 먼저 만들어 줘야 함. why? -> 연관에 의한 초기화!!
        PizzaStore store = new PizzaStore(factory);
        
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("갈치 주문 " + pizza.name + "\n");
        
        pizza = store.orderPizza("veggie");
        System.out.println("조엘 주문 " + pizza.name);
    }
    
}
