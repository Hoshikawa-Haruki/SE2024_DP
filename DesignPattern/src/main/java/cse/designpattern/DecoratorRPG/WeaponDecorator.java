/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.DecoratorRPG;

/**
 *
 * @author 이승환
 */
public abstract class WeaponDecorator extends Player {

    protected Player player;

    @Override
    public abstract String getDescription(); // 사용하는 의미X → 추상메서드
}
