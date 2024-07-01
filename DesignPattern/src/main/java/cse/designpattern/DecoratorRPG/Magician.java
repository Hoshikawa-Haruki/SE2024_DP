/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.DecoratorRPG;

/**
 *
 * @author 이승환
 */
public class Magician extends Player {

    public Magician() {
        description = "마법사";
    }

    @Override
    public double damage() {
        return 0.5;
    }

    @Override
    public double armor() {
        return 0.5;
    }

}
