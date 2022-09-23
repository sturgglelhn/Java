package com.javase.annotation7;


/**
 * 自定义异常
 */
public class NotHasIdPropertyException extends RuntimeException{
    public NotHasIdPropertyException(){

    }

    public NotHasIdPropertyException(String s) {
        super(s);
    }
}
