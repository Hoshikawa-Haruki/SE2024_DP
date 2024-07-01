/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.DecoratorPattern;

/**
 *
 * @author 이승환
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    @Override
    public abstract String getDescription(); // 사용하는 의미X → 추상메서드
}
