/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.HomeAutomation;

/**
 *
 * @author 이승환
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light(); // 리시버
        LightOnCommand lightOn = new LightOnCommand(light); // 구상 커맨드 - 리시버 간 연결
        remote.setCommand(lightOn); // 인보커 로딩
        remote.buttonWasPressed();
        remote.buttonWasPressed();
    }

}
