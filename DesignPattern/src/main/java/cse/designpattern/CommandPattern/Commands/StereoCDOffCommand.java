/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPattern.Commands;

import cse.designpattern.CommandPattern.Receiver.StereoCD;

/**
 *
 * @author 이승환
 */
public class StereoCDOffCommand implements Command {

    StereoCD stereoCD;

    public StereoCDOffCommand(StereoCD stereoCD) {
        this.stereoCD = stereoCD;
    }

    @Override
    public void execute() {
        stereoCD.off();
    }

    @Override
    public void undo() {
    }

}
