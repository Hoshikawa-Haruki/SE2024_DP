/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.HomeAutomation;

/**
 *
 * @author 이승환
 */
public class SimpleRemoteControl {

    private Command command; // 현재 설정된 커맨드 객체

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        // 커맨드 객체를 설정 (인보커 로딩)
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
