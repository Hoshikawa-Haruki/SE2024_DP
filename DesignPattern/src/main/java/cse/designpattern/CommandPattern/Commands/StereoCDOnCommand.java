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
public class StereoCDOnCommand implements Command {

    StereoCD stereoCD;

    public StereoCDOnCommand(StereoCD stereoCD) {
        this.stereoCD = stereoCD; // 제어할 오디오의 인스턴스 전달받음. stereo라는 지역 인스턴스 변수에 저장
    }

    @Override
    public void execute() {
        stereoCD.on();
        stereoCD.setCd();
        stereoCD.setVolume(11);
    }

    @Override
    public void undo() {
    }

}
