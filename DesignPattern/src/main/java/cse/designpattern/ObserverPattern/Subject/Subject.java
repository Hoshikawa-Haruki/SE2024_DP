/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cse.designpattern.ObserverPattern.Subject;

import cse.designpattern.ObserverPattern.Observer.Observer;

/**
 *
 * @author 이승환
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(); // 모든 옵저버들에게 변경내용 알림
}
