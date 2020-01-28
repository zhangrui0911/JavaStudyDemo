package com.zeroten.jc;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-29 0:52
 */
public class CopyTest {
    @Test
    public void testCopy() throws CloneNotSupportedException {
        Employee e1 = new Employee();
        Employee e2 = e1.clone();
    }
}
