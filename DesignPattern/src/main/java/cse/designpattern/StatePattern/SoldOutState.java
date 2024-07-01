/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.StatePattern;

/**
 *
 * @author 이승환
 */
public class SoldOutState implements State {

    GumballMachine gumBallMachine;

    public SoldOutState(GumballMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("검볼이 없습니다.");
        ejectCoin();
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전을 반환합니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("검볼이 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("검볼이 없습니다.");
    }

}
