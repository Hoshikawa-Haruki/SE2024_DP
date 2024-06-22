/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Defense;

/**
 *
 * @author 이승환
 */
public class DfDodge implements Defense {

    @Override
    public void doDefense() {
        System.out.println("방어구가 없어 공격을 회피합니다. 50% 확률");
    }
    
}
