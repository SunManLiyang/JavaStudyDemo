package com.zeroten.javales;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AgeCheckTest {

    //String AgeCheck.GetAgeName(int age)

    @Test
    public void testAgetCheck() {
        Assert.assertEquals(AgeCheck.getAgeName(6),"儿童");

    }
}
