/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.StatePattern;

/**
 *
 * @author 이승환
 */
public class NoCoinState implements State {

    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) { // 생성자로 부터 뽑기기계의 레퍼런스전달, 변수에 저장
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("동전을 넣었습니다.");
        gumballMachine.setState(gumballMachine.hasCoinState);
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전이 없습니다.-1");

    }

    @Override
    public void dispense() {
        //System.out.println("동전이 없습니다.-2");
    }

}
