/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.Multiple;

/**
 *
 * @author 이승환
 */
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "전등을 켭니다... ON");
    }

    public void off() {
        System.out.println(location + "전등을 끕니다... OFF");
    }
}
