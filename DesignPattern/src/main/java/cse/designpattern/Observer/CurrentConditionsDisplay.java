/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Observer;

/**
 *
 * @author 이승환
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    
    private float temperature;
    private float humidity;
    private WeatherData weatherData; // 주제 클래스 연관

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // 옵저버로 등록
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재상태 : 온도 " + temperature + "F, 습도 " + humidity + "%");
    }
    
}
