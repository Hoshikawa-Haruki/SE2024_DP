/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Observer;

/**
 *
 * @author 이승환
 */
public class PressureDisplay implements Observer, DisplayElement {
    private float pressure;
    private WeatherData pweatherData; // 주제 클래스 연관

    public PressureDisplay(WeatherData mweatherData) {
        this.pweatherData = mweatherData;
        pweatherData.registerObserver(this); // 옵저버 등록
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 기압 : " + pressure);
    }
    
}
