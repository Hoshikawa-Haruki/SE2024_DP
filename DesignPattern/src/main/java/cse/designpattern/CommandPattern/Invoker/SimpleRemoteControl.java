/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPattern.Invoker;

import cse.designpattern.CommandPattern.Commands.Command;

/**
 *
 * @author 이승환
 */
public class SimpleRemoteControl { // 인보커

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute(); // 슬롯에 연결된 커맨드 객체의 execute 호출
    }
}
