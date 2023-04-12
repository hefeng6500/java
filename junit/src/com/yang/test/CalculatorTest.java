package com.yang.test;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
        System.out.println("add 执行完毕！");
    }

    @Test
    public void testReduce() {
        Calculator calculator = new Calculator();

        int result = calculator.reduce(6, 3);

        assertEquals(3, result);
        System.out.println("reduce 执行完毕！");
    }

    @Before
    public void testBefore() {
        System.out.println("用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次。\n");
    }

    @After
    public void testAfter() {
        System.out.println("用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次。");
    }

    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("用来静态修饰方法，该方法会在所有测试方法之前只执行一次。");
    }

    @AfterClass
    public static void testAfterClass() {
        System.out.println("用来静态修饰方法，该方法会在所有测试方法之后只执行一次。\n");
    }
}

