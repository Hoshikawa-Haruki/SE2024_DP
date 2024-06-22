/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Defense;

/**
 *
 * @author 이승환
 */
public class DfBow implements Defense {

    @Override
    public void doDefense() {
        System.out.println("활로 공격을 막습니다. 데미지 40% 경감");
    }
    
}
