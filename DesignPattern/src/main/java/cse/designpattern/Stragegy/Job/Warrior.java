
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Job;

import cse.designpattern.Stragegy.Attack.AkSword;
import cse.designpattern.Stragegy.Defense.DfShield;

/**
 *
 * @author 이승환
 */
public class Warrior extends Player { //공격-칼 방어-방패

    public Warrior() {
        this.attack_Behavior = new AkSword();
        this.defense_Behavior = new DfShield();
    }
}
