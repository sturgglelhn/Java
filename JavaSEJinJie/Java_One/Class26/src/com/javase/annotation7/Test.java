package com.javase.annotation7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception{
        // 获取类
        Class userClass = Class.forName("com.javase.annotation7.User");
        // 判断类上是否存在Id注解
        boolean isOk = false;
        if(userClass.isAnnotationPresent(MustHasIdPropertyAnnotation.class)){
            // 当一个类上面有@Id注解的时候，要求类中必须存在int类型的Id属性
            // 如果没有int类型的Id属性则报异常。
            // 获取类的属性
            Field[] fields = userClass.getDeclaredFields();
            for(Field field:fields){
                if("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                    // 表示这个类是合法的类。有@Id注解，则这个必须有int类型的id
                    isOk = true;
                    break;
                }
            }

            // 判断是否合法
            if(!isOk){
                throw new NotHasIdPropertyException("被@MustHasIdPropertyAnnotation注解标注的类中必须要有一个int类型的Id属性！");
            }
        }

    }
}
