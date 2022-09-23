package com.javase.Array;

public class ArrayTest06 {
    //用户名和密码输入到String[] args数组当中。
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("输入用户名和密码，例如：zhangsan 123");
            return;
        }

        //程序执行到此处说明用户确实提供了用户名和密码
        //接下来你应该判断用户名和密码是否正确
        //取出用户名
        String username = args[0];
        String password = args[1];


        //if(username.equals("admin") && password.equals("123")){
        //这样编写是不是可以避免空指针异常
        //采用一下编码风格，及时username和password都是null，也不会出现空指针异常。
        if("admin".equals(username) && "123".equals(password)){
            System.out.println("登录成功，欢迎["+username+"]回来");
            System.out.println("您可以继续使用该系统...");
        }else{
            System.out.println("验证失败，用户名不存在或者密码错误！");
        }
    }
}
