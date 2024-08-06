/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.Multiple;

/**
 *
 * @author 이승환
 */
public class CeilingFan {

    private String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + "실링팬을 켭니다.");
    }

    public void off(){
        System.out.println(location + "실링팬을 끕니다.");
    }

}
