package com.kemon.pay.sdk;

import org.junit.Assert;
import org.junit.Test;

/**
 * DESCRIPTION
 *
 * @Author 59491
 * @Date 2026-01-18:11
 **/
public class DemoTest {

    @Test
    public void test_getVersion () {
        Assert.assertEquals(new Demo().getVersion(), "1.0.0");
    }
}
