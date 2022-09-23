package com.javase.exception;

import java.io.IOException;

/*
之前在讲解方法覆盖的时候，但是遗留一个问题？
    重写之后的方法不能比重写之前的方法抛出更多（更宽泛）的异常，可以更少。
* */
class Animal{
    /*public void doSome() throws NullPointerException{

    }*/

    public void doSome(){

    }
}

class Cat extends Animal {
    /*public void doSome() throws Exception {

    }*/

    /*public void doSome() throws NullPointerException {

    }*/

    public void doSome() throws RuntimeException{

    }

}
/*
总结：重写父类中的方法之后，不能比父类中抛出的异常多，可以更少；
    父类没有抛出方法时，子类重写方法中不能抛出异常；如果父类中的异常抛出
    的小(如果抛出NullPointerException)，子类的异常不能抛出大于父类中的
    异常(Exception)，此时就会报错，因为Exception是NullPointerException父类，
    NullPointerException继承Exception

大总结异常中的关键字：
    异常捕捉：
        try
        catch
        finally

    throws 在方法声明位置上使用，表示上班异常信息给调用者。
    throw 手动抛出异常！
* */