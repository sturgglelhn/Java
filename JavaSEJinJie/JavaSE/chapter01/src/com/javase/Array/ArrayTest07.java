package com.javase.Array;

/*
    一维数组的深入，数组中存储的类型为：引用数据类型
* */
public class ArrayTest07 {
    public static void main(String[] args) {
        int[] array = {100, 200, 300};
        System.out.println(array[1]);
        //静态初始化数组
        int[] a = {1,2,3};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //创建一个Animal类型的数据
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};
        animals[1].move();

        //对Animal数据进行遍历
        for (int i = 0; i < animals.length; i++) {
           /* Animal a = animals[i];
            a.move();*/
            //代码合并
            animals[i].move();
        }

        Animal[] ans = new Animal[2];
        ans[0] = new Animal();
        //ans[1] = new Product()
        //Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal。
        //Cat是Anima的子类。
        ans[1] = new Cat();

        //创建一个Animal类型的数组，数组当中存储Cat和Bird
        Animal[] anis = {new Cat(), new Bird()};

        for (int i = 0; i < anis.length; i++) {
            //如果调用的方法是父类中存在的方法不需要向下转型。直接使用父类型引用调用即可。
            //anis[i].move();

            //调用子对象特有方法的话，需要向下转型！！！
            if(anis[i] instanceof Cat){
                Cat cat = (Cat)anis[i];
                cat.catchMouse();
            }else if(anis[i] instanceof Bird){
                Bird bird = (Bird)anis[i];
                bird.sing();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("Animal move....");
    }
}

class Product{

}

//Cat是子类
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！！！");
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠！！！");
    }
}

//Bird是子类
class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞翔！！！");
    }

    //特有的方法
    public void sing(){
        System.out.println("鸟儿在唱歌！！！");
    }
}