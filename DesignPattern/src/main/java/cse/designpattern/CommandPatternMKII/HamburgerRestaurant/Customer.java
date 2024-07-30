/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.HamburgerRestaurant;

/**
 *
 * @author 이승환
 */
public class Customer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Waitress waitress = new Waitress(); // 인보커
        HamburgerChef chef = new HamburgerChef(); // 리시버
        HamburgerOrder orderList = new HamburgerOrder(chef);
        
        waitress.setCommand(orderList);
        waitress.takeOrder();
    }
    
}
