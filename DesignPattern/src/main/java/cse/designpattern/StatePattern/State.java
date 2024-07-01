/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cse.designpattern.StatePattern;

/**
 *
 * @author 이승환
 */
public interface State {

    public void insertCoin();

    public void ejectCoin();

    public void turnCrank();

    public void dispense();
}
