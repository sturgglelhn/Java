package com.javase.Array.homework02;

/*
军队
* */
public class Army {
    /**
     * 武器数组
     */
    private weapon[] weapons;

    /**
     * 创建军队的构造方法
     * @param count 武器数量
     */
    public Army(int count){
        //动态初始化数组中每一个元素默认值是null.
        //武器数组是有的，但是武器数组中没有放武器。
        weapons = new weapon[count];
    }

    /**
     * 将武器加入数组
     * @param weapon
     */
    public void addWeapon(weapon weapon){

    }

    /**
     * 所有可攻击的武器攻击
     */
    public void attackAll(){

    }

    /**
     * 所有可移动的武器移动
     */
    public void moveAll(){

    }
}
