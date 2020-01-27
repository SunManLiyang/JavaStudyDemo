package com.zeroten.javales;

import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void testBlockScope() {
        int n1 = 2;
        System.out.println(n1);
    }

}