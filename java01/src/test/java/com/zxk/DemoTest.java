package com.zxk;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: maven_project
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-08-25 21:08
 **/
public class DemoTest {
    @Test
    public void testSay() {
        Demo demo = new Demo();
        String maven = demo.say("maven");
        Assert.assertEquals("hello maven", maven);
    }
}
