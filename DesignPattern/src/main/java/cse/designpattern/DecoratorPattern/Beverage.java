/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.DecoratorPattern;

/**
 *
 * @author 이승환
 */
public abstract class Beverage {

    protected String description;

    public String getDescription() { // CondimentDecorator 말고 다른 상속 받는것들은 getDescription을 사용하기 때문에 구상메서드
        return description;
    }

    public abstract double cost(); // 
}
