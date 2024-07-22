/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Job;

import cse.designpattern.Stragegy.Attack.AkBow;
import cse.designpattern.Stragegy.Defense.DfDodge;

/**
 *
 * @author 이승환
 */
public class Marksman extends Archer {

    public Marksman() {
        System.out.println("나는 신궁이다 쾅쾅");
        this.attack_Behavior = new AkBow(1000);
        this.defense_Behavior = new DfDodge();
    }
    
}
