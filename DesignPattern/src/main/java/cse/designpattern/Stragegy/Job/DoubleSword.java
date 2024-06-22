/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Job;

import cse.designpattern.Stragegy.Attack.AkSword;
import cse.designpattern.Stragegy.Defense.DfSword;

/**
 *
 * @author 이승환
 */
public class DoubleSword extends Player { //공격-칼 방어-칼

    public DoubleSword() {
        this.attack_Behavior = new AkSword();
        this.defense_Behavior = new DfSword();
    }

}
