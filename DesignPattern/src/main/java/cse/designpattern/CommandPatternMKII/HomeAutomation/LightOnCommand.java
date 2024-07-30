/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.HomeAutomation;

/**
 *
 * @author 이승환
 */
public class LightOnCommand implements Command {

    private Light light;
    boolean lightFlag = true;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (lightFlag == true) {
            light.on();
        } else {
            light.off();
        }
        lightFlag = !lightFlag;
    }
}
