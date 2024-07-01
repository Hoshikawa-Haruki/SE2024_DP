/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.StatePattern;

import java.util.Random;

/**
 *
 * @author 이승환
 */
public class HasCoinState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumBallMachine;

    public HasCoinState(GumballMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("현재 동전이 이미 있습니다.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전이 반환됩니다.");
        gumBallMachine.setState(gumBallMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌립니다.");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumBallMachine.getCount() > 1)) {
            gumBallMachine.setState(gumBallMachine.getWinnerState());
        } else {
            gumBallMachine.setState(gumBallMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("먼저 손잡이를 돌려야 합니다.");
    }
}
