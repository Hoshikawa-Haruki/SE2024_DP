/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPattern.Receiver;

/**
 *
 * @author 이승환
 */
public class StereoCD {

    public void on() {
        System.out.println("시디 켜져라 얍");
    }

    public void off() {
        System.out.println("시디 꺼져라 얍");
    }

    public void setCd() {
        System.out.println("시디 세팅!");
    }

    public void setDvd() {
        System.out.println("디비디 세팅!");
    }

    public void setVolume(int volume) {
        System.out.println("소리 " + volume + "로 조절!");
    }

}
