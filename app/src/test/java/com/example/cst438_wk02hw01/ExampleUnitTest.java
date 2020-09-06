package com.example.cst438_wk02hw01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void usernameTest(){
        assertTrue(MainActivity.checkUsername("din_djarin"));
        assertFalse(MainActivity.checkUsername("Ben Zhang"));
    }

    @Test
    public void passwordTest(){
        assertTrue(MainActivity.checkPassword("baby_yoda_ftw"));
        assertFalse(MainActivity.checkPassword("zhangben"));
    }
}