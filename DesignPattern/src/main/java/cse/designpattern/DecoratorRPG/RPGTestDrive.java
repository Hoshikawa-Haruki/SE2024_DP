/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.DecoratorRPG;

/**
 *
 * @author 이승환
 */
public class RPGTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p1 = new Magician();
        System.out.println(p1.getDescription());
        System.out.println(p1.damage() + " " + p1.armor());

        p1 = new Staff(p1);
        System.out.println(p1.getDescription());
        System.out.println(p1.damage() + " " + p1.armor());

        Player p2 = new Warrior();
        System.out.println(p2.getDescription());
        System.out.println(p2.damage() + " " + p2.armor());

        p2 = new Shield(p2);
        System.out.println(p2.getDescription());
        System.out.println(p2.damage() + " " + p2.armor());
        
        p2 = new Shield(p2);
        System.out.println(p2.getDescription());
        System.out.println(p2.damage() + " " + p2.armor());
    }

}
