/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 이승환
 */
public class WeatherData implements Subject{ // 구체적인 상태 클래스
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {
        observers = new ArrayList<>();
    }
       
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() { // 상태 변화 공지
        for(Observer targetObserver : observers){
            targetObserver.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged() { // 변화측정 -> 노티파이 실행
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){ // 셋 후 변화 측정 실행
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged(); 
    }   

}
