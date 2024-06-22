/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Attack;

/**
 *
 * @author 이승환
 */
public class AkShield implements Attack {

    @Override
    public void doAttack() {
        System.out.println("방패치기를 시전합니다. 쾅쾅");
    }
    
}
