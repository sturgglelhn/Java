package javase.HomeWorks.Test01;

/**
 * 宠物店类，收纳宠物（Animal）
 */
public class PetStore {
    /**
     *收纳动物方法，只要是动物都可以收纳
     *
     * @param animal
     */
    public void store(Animal animal){
        //调用动物的吃饭方法
        animal.eat();

        //调用动物的睡觉方法
        animal.sleep();
    }
}
