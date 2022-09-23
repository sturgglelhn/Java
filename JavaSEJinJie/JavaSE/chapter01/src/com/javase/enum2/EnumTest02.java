package com.javase.enum2;

//采用枚举的方式改造程序
/*
总结：
    1、枚举是一种引用数据类型
    2、枚举类型怎么定义，语法是？
        enum 枚举类型名{
            枚举值1,枚举值2
        }
    3、结果只有两种情况，建议使用布尔类型、
    结果超过两种并且还是可以一枚一枚列举出来的，建议使用枚举类型。
        例如：颜色、四季、星期等都可以使用枚举类型。
* */
public class EnumTest02 {
    public static void main(String[] args) {
        Result r = divide(10,2);
        System.out.println(r == Result.SUCCESS ? "计算成功" : "计算失败");
    }

    /**
     * 计算两个int类型数据的商
     * @param a int数据
     * @param b int数据
     * @return
     */
    public static Result divide (int a, int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}

enum Result{
    SUCCESS,FAIL;
}
