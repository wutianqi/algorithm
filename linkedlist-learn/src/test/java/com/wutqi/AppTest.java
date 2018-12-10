package com.wutqi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        a1 = a2;
        System.out.println(a1 == a2);
        a2 = a3;
        System.out.println(a1 == a3);
    }

    class A {}
}

