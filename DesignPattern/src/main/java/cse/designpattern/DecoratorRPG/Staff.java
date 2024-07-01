/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.DecoratorRPG;

/**
 *
 * @author 이승환
 */
public class Staff extends WeaponDecorator {

    public Staff(Player player) {
        this.player = player;
    }

    @Override
    public String getDescription() {
        return player.getDescription() + ", 지팡이 장착";
    }

    @Override
    public double damage() {
        return player.damage() + 2.0;
    }

    @Override
    public double armor() {
        return player.armor() + 1.0;
    }

}
