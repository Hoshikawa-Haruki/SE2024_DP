/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.HamburgerRestaurant;

/**
 *
 * @author 이승환
 */
public class Waitress {

    private Command command;

    public void takeOrder() {
        System.out.println("웨이트리스가 주문을 받습니다.");
        command.orderUp();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

}
