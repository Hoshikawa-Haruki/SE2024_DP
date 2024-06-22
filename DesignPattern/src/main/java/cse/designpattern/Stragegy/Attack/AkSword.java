/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Attack;

/**
 *
 * @author 이승환
 */
public class AkSword implements Attack {

    @Override
    public void doAttack() {
        System.out.println("대검으로 내려칩니다. 챙챙");
    }

}
