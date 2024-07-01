/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.DecoratorRPG;

/**
 *
 * @author 이승환
 */
public class Warrior extends Player {

    public Warrior() {
        description = "전사";
    }

    @Override
    public double damage() {
        return 1.0;
    }

    @Override
    public double armor() {
        return 1.0;
    }

}
