/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.Multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 이승환
 */
public class RemoteLoader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("거실");
        LightOnCommand livingLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOff = new LightOffCommand(livingRoomLight);
        remote.setCommand(0, livingLightOn, livingLightOff);

        Light kitchenLight = new Light("주방");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);

        CeilingFan livingRoomCeilingFan = new CeilingFan("거실");
        CeilingFanOnCommand fanOn = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(livingRoomCeilingFan);
        remote.setCommand(2, fanOn, fanOff);
        
        System.out.println(remote);

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 100) {
                break;
            }
            remote.onButtonWasPushed(input);
            remote.offButtonWasPushed(input);

        }
        System.out.println("프로그램이 종료됩니다.");

    }

}
