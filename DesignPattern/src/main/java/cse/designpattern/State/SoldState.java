/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.State;

/**
 *
 * @author 이승환
 */
public class SoldState implements State {

    GumballMachine gumBallMachine;

    public SoldState(GumballMachine gumBallMachine) {
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
        if (gumBallMachine.getCount() > 0) {
            gumBallMachine.setState(gumBallMachine.getNoCoinState());
        } else {
            System.out.println("검볼 매진!!");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }

}
