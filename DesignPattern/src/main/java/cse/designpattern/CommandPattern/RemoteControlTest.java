/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.CommandPattern;

import cse.designpattern.CommandPattern.Commands.LightOffCommand;
import cse.designpattern.CommandPattern.Receiver.Light;
import cse.designpattern.CommandPattern.Invoker.SimpleRemoteControl;
import cse.designpattern.CommandPattern.Commands.LightOnCommand;
import cse.designpattern.CommandPattern.Commands.StereoCDOffCommand;
import cse.designpattern.CommandPattern.Commands.StereoCDOnCommand;
import cse.designpattern.CommandPattern.Invoker.RemoteControl;
import cse.designpattern.CommandPattern.Receiver.StereoCD;

/**
 *
 * @author 이승환
 */
public class RemoteControlTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        SimpleRemoteControl remote = new SimpleRemoteControl(); // remote = 인보커
//        Light light = new Light(); // 리시버 객체 생성
//        LightOnCommand lightOn = new LightOnCommand(light); // 커맨드 객체 생성, 리시버 전달
//        
//        remote.setCommand(lightOn); // 인보커에 커맨드 전달 (리모콘에 등록)
//        remote.buttonPressed();

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("living");
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);

        StereoCD str = new StereoCD(); // 리시버
        StereoCDOnCommand cdOnCommand = new StereoCDOnCommand(str);
        StereoCDOffCommand cdOffCommand = new StereoCDOffCommand(str);
        remoteControl.setCommand(1, cdOnCommand, cdOffCommand);
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);

        Light kitchenlight = new Light("Kitchen");
        LightOnCommand klightOn = new LightOnCommand(kitchenlight);
        LightOffCommand klightOff = new LightOffCommand(kitchenlight);

        remoteControl.setCommand(2, klightOn, klightOff);
        remoteControl.onButtonPressed(2);
        remoteControl.offButtonPressed(2);

        System.out.println(remoteControl);
    }

}
