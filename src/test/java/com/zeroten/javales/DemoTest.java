package com.zeroten.javales;

import org.testng.annotations.Test;

import java.util.Random;

public class DemoTest {
    @Test
    public void testBlockScope() {
        int n1 = 2;
        System.out.println(n1);

    }

    @Test
    public void testRandom() {

        int r = new Random().nextInt(1000);
        System.out.println("产生随机数"+r);
    }


}