/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.FactoryMethodPattern;

/**
 *
 * @author 이승환
 */
public class GreekPizza extends Pizza {

    public GreekPizza() {
        name = "Greek Pizza";
        dough = "Oily Crust";
        sauce = "Tomato Sauce";
        toppings.add("Feta Cheese");
        toppings.add("Onion");
        toppings.add("Olive");
    }

}
