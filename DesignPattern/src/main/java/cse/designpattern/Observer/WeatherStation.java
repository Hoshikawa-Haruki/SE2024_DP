/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse.designpattern.Observer;

/**
 *
 * @author 이승환
 */
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // 주제 객체
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData); // 상태 옵저버 등록
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData); // 기압 옵저버 등록

        weatherData.setMeasurements(80, 65, 30.4f); // 이벤트 발생 1
        weatherData.setMeasurements(70, 65, 30.4f); // 이벤트 발생 2
        weatherData.setMeasurements(60, 65, 30.4f); // 이벤트 발생 3

        weatherData.removeObserver(pressureDisplay); // 기압 옵저버 삭제
        weatherData.setMeasurements(50, 65, 30.4f); // 이벤트 발생 4(상태 옵저버만 호출)

    }

}
