package com.yang.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    //    创建 Logback 日志对象，代表日志技术
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");

    public static void main(String[] args) {
        LOGGER.info("Hello");
        LOGGER.debug("debugger");

        LOGGER.error("Error message");
        LOGGER.trace("trace");

        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.toString());
        }
    }
}
