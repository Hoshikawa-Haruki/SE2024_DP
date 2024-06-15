/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Command;

/**
 *
 * @author 이승환
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) { // 커맨드 객체로 제어할 특정 조명을 전달
        // 그 객체는 light라는 변수에 저장.
        // execute() 메서드가 호출되면, lighter 객체가 그 요청의 리시버가 됨
        this.light = light; // light객체의 on() 호출
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
    }

}
