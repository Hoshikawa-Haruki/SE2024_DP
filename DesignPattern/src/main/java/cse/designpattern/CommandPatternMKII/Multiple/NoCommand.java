/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.Multiple;

/**
 *
 * @author 이승환
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("아무것도 작동 되지 않습니다.");
    }

    @Override
    public void undo() {
        System.out.println("어차피 아무 기능도 없어서 취소가 안되요");
    }

}
