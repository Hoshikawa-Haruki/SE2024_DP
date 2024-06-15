/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPattern.Receiver;

/**
 *
 * @author 이승환
 */
public class Light { // 리시버

    String receiverName;

    public Light(String a) {
        this.receiverName = a;
    }

    public void on() {
        System.out.println(receiverName + "전등 켜져라 얍");
    }

    public void off() {
        System.out.println(receiverName + "전등 꺼져라 얍");
    }
}
