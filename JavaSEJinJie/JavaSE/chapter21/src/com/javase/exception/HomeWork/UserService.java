package com.javase.exception.HomeWork;


public class UserService {
    /**
     * 用户名注册
     * @param username  用户名
     * @param password  密码
     * @throws IllegalNameException
     */
    public void register(String username, String password) throws IllegalNameException {
        if(username == null || username.length() < 6 || username.length() > 14){
            throw new IllegalNameException("用户名不合法，长度必须在[6-14]之间");
        }
        if(password == null || password.length() < 6 || password.length() > 14){
            throw new IllegalNameException("密码不合法，长度必须在[6-14]之间");
        }

        System.out.println("注册成功，欢迎" + username + "，密码为："+password+".");
    }

}
