/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Job;

import cse.designpattern.Stragegy.Attack.AkBow;
import cse.designpattern.Stragegy.Defense.DfShield;

/**
 *
 * @author 이승환
 */
public class WildHunter extends Archer {

    public WildHunter() {
        System.out.println("나는 와일드헌터다 야호");
        this.attack_Behavior = new AkBow(200);
        this.defense_Behavior = new DfShield();
    }
}
