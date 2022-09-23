package com.javase.Array.homework02;

/**
 * 战斗机，是武器，可以移动，可攻击
 */
public class Fighter extends weapon implements Moveable,Shootable{

    @Override
    public void move() {
        System.out.println("战斗机起飞！");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开炮！");
    }
}
