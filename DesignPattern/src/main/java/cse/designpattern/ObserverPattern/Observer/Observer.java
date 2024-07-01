/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cse.designpattern.ObserverPattern.Observer;

/**
 *
 * @author 이승환
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
    // 옵저버에게 측정 값들을 전달
}
