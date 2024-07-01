/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.StatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 이승환
 */
public class StateTestDrive {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        GumballMachine testBall = new GumballMachine(100);
        while (testBall.getCount() != 0) {
            String a = br.readLine();
            if(a.equals("1")){
                testBall.insertCoin();
            }
            else if(a.equals("2")){
                testBall.turnCrank();
            }
        }
    }
}
