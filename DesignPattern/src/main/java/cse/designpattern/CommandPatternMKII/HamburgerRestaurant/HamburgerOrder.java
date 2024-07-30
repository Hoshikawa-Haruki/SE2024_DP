/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.HamburgerRestaurant;

/**
 *
 * @author 이승환
 */
public class HamburgerOrder implements Command {

    private HamburgerChef chef; // 1. 의존 객체 생성 : HamburgerChef와 같은 의존 객체가 먼저 생성
    // 구체적으로 햄버거를 만드는 사람이 누구인지 알아야 함 (연관)

    public HamburgerOrder(HamburgerChef chef) {
        this.chef = chef; // this.chef는 클래스의 인스턴스 변수, chef는 생성자의 매개변수
        // 주입: 의존하는 객체 생성 시 의존 객체를 생성자로 전달
    }

    @Override
    public void orderUp() {
        System.out.println("햄버거 주문서가 주방에 전달됩니다.");
        chef.makeBurger();
    }
}
