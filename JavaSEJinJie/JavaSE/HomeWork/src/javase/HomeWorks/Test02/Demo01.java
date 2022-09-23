package javase.HomeWorks.Test02;

public class Demo01 {
    public static void main(String[] args) {
        //创建苹果
        Apple apple = new Apple();
        /*apple.benefit();*/

        //创建香蕉
        Banana banana = new Banana();
        /*banana.benefit();*/


        Fruit appleFruit = new Apple(); //创建一个水果
        /*appleFruit.benefit();*/       //具体什么功效（看new的什么水果）

        Fruit bananaFruit = new Banana();   //创建一个水果
       /* bananaFruit.benefit();*/          //具体什么功效（看new的什么水果）

        showBenefit(apple);  //可以直接通过抽象类Fruit来查看子类中apple的子方法
        showBenefit(banana);    //可以直接通过抽象类Fruit来查看子类中banana的子方法
    }


    //通过方法来调用apple.benefit()
    /*public static void showAppleBenefit(Apple apple){
        apple.benefit();
    }*/

    //通过方法来调用banana.benefit()
    /*public static void showBananaBenefit(Banana banana){
        banana.benefit();
    }*/

    //通过showBenefit方法来调用Fruit
    public static void showBenefit(Fruit fruit){
        fruit.benefit();
    }

}
