package com.javase.exception.HomeWork;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();

        try {
            userService.register("jackson","123456");
        } catch (IllegalNameException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
