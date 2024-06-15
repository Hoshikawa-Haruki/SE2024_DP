/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.State;

/**
 *
 * @author 이승환
 */
public class WinnerState implements State {

    GumballMachine gumBallMachine;

    public WinnerState(GumballMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertCoin() {
    }

    @Override
    public void ejectCoin() {
    }

    @Override
    public void turnCrank() {
    }

    @Override
    public void dispense() {
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() == 0) {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        } else {
            gumBallMachine.releaseBall();
            System.out.println("축하합니다. 원플러스원!");
            if (gumBallMachine.getCount() > 0) {
                gumBallMachine.setState(gumBallMachine.getNoCoinState());
            } else {
                System.out.println("당첨 됬는데 하필이면 매진이네 ㅠ");
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }
        }
    }

}
