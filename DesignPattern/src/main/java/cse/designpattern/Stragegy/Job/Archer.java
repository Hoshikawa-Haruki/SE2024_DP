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
public class Archer extends Player { // 공격-활 방어-회피

    public Archer() {
        System.out.println("나는 궁수 직업이에요");
    }
}
