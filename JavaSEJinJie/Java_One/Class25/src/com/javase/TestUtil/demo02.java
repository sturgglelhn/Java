package com.javase.TestUtil;

import org.junit.*;

public class demo02 {

    @Before
    public void Before(){
        System.out.println("Before....");
    }

    @After
    public void After(){
        System.out.println("After....");
    }

    @Test
    public void test(){
        System.out.println("Test...");
    }

    @BeforeClass
    public static void BeforeClass(){   // 一般用于资源的初始化
        System.out.println("BeforeClass....");
    }

    @AfterClass
    public static void AfterClass(){    // 一般用于释放系统资源
        System.out.println("AfterClass....");
    }

}

/*
运行结果：
-----------------------------
    BeforeClass....
    Before....
    Test...
    After....
    AfterClass....
-----------------------------

总结：
    @Before：在执行每个测试方法之前都会执行一次
    @After：在执行每个测试方法之后都会执行一次
    @BeforeClass：在执行每个测试方法之前执行一次，比@Before更先执行，方法必须被static修饰
    @AfterClass：在执行每个测试方法之后执行一次，比@After更后执行，方法必须被static修饰

* */
