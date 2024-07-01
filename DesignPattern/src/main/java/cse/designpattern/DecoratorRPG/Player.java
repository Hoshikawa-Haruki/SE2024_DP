/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.DecoratorRPG;

/**
 *
 * @author 이승환
 */
public abstract class Player {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double damage();

    public abstract double armor();
}
