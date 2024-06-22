/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Stragegy.Job;

import cse.designpattern.Stragegy.Attack.Attack;
import cse.designpattern.Stragegy.Defense.Defense;

/**
 *
 * @author 이승환
 */
public class Player {
    
    public Attack attack_Behavior;
    public Defense defense_Behavior;

    public void doAtack() {
        attack_Behavior.doAttack();
    }

    public void doDefense() {
        defense_Behavior.doDefense();
    }
}
