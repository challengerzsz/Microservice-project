package com.bsb.order.utils;

import java.util.Random;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 21:32
 */
public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 1000000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
