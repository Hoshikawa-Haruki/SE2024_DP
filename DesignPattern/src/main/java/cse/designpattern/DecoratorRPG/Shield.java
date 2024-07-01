/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.DecoratorRPG;

/**
 *
 * @author 이승환
 */
public class Shield extends WeaponDecorator {

    public Shield(Player player) {
        this.player = player;
    }

    @Override
    public String getDescription() {
        return player.getDescription() + ", 방패 장착";
    }

    @Override
    public double damage() {
        return player.damage() + 0.0;
    }

    @Override
    public double armor() {
        return player.armor() + 5.0;
    }

}
