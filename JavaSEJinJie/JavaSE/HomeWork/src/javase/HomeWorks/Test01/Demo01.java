package javase.HomeWorks.Test01;

public class Demo01 {
    public static void main(String[] args) {
        //创建宠物店
        PetStore petStore = new PetStore();

        //创建狗类
        Dog dog = new Dog();
        //传入狗类
        petStore.store(dog);

        //创建猫类
        Cat cat = new Cat();
        //传入猫类
        petStore.store(cat);
    }
}

/*
总结：多态的程序测试，提高了程序的可扩展性和代码的复用性
    通过父类引用指向子类对象

结论：当使用多态方法调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误，
    如果有，执行的是子类的重写方法。
* */
