/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.FactoryMethod.SimpleFactory;

/**
 *
 * @author 이승환
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        name  = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated pzrmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushromms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black oliveds");
    }


}
