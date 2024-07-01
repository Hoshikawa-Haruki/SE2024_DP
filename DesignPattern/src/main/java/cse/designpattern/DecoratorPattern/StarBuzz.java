/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.DecoratorPattern;

/**
 *
 * @author 이승환
 */
public class StarBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage b1 = new Milk(new Espresso());
        System.out.println(b1.getDescription());
   }

}
