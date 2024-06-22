/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Job;

import cse.designpattern.Stragegy.Attack.AkShuriken;
import cse.designpattern.Stragegy.Defense.DfDodge;

/**
 *
 * @author 이승환
 */
public class Ninja extends Player { //공격-표창 방어-회피

    public Ninja() {
        this.attack_Behavior = new AkShuriken();
        this.defense_Behavior = new DfDodge();
    }

}
