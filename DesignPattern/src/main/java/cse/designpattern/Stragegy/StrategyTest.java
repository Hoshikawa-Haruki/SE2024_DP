/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.Stragegy;

import cse.designpattern.Stragegy.Job.Archer;
import cse.designpattern.Stragegy.Job.DoubleSword;
import cse.designpattern.Stragegy.Job.Ninja;
import cse.designpattern.Stragegy.Job.Player;
import cse.designpattern.Stragegy.Job.Warrior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 이승환
 */
public class StrategyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Player p1 = null;
        while (true) {
            if (p1 == null) {
                System.out.println("현재 직업이 없습니다. 직업을 골라주세요");
                System.out.println("1. 궁수 2. 닌자 3. 검사 4. 방패전사");
                int input = Integer.parseInt(br.readLine());
                switch (input) {
                    case 1:
                        p1 = new Archer();
                        break;
                    case 2:
                        p1 = new Ninja();
                        break;
                    case 3:
                        p1 = new DoubleSword();
                        break;
                    case 4:
                        p1 = new Warrior();
                        break;
                }
                input = 0;
            }
            System.out.println("1. 공격 2. 방어 3. 직업변경");
            while (p1 != null) {
                int input = Integer.parseInt(br.readLine());
                switch (input) {
                    case 1:
                        p1.doAtack();
                        break;
                    case 2:
                        p1.doDefense();
                        break;
                    case 3:
                        p1 = null;
                        break;
                }
            }
        }
    }
}
