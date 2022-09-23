package javase.HomeWorks.Test01;

public class Demo02 {
    public static void main(String[] args) {
        //向下转型
        /*Animal1 animal1 = new Cat1();
        animal1.eat();*/

        //向下转型
        /*Cat1 cat1 = (Cat1)animal1;
        cat1.eat();*/

        Animal1 animal1 = new Dog1();
        //Cat1 cat1 = (Cat1)animal1;
        /*明明创建了Dog类型对象，当然不能转换成Cat对象的，
        两个类型并没有任何继承关系，不符合类型转换的定义。*/
        if(animal1 instanceof Cat1){
            Cat1 cat1 =  (Cat1)animal1; //错误
        }else{
            System.out.println("不是该类型！");
        }

    }

}

class Animal1{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Dog1 extends Animal1{
    public void eat(){
        System.out.println("狗吃骨头");
    }
}

class Cat1 extends Animal1{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}