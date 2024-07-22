/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Attack;

/**
 *
 * @author 이승환
 */
public class AkBow implements Attack {
    
    int attackDamage;

    public AkBow(int damage) {
        this.attackDamage = damage;
    }

    @Override
    public void doAttack() {
        System.out.println("데미지: " + attackDamage + "활을 쏩니다. 퓽퓽");
    }
    
}
