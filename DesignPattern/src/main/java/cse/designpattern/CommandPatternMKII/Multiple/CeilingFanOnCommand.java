/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.Multiple;

/**
 *
 * @author 이승환
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.fan = ceilingFan;
    }

    @Override
    public void execute() {
       fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }

}
