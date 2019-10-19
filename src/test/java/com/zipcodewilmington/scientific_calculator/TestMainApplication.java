package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */


public class TestMainApplication {
    @Test
    public void testcalcAdd() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 2;
        int b = 5;
        int expected = a + b;
        // when

        //then
        int outcome = mainApplication.calcAdd (a, b);
        Assert.assertEquals (expected, outcome);

    }
    @Test
    public void testcalcAdd1() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 4;
        int b = 8;
        int expected = a + b;
        // when

        //then
        int outcome = mainApplication.calcAdd (a, b);
        Assert.assertEquals (expected, outcome);

    }
    @Test
    public void testcalcAdd2() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 3;
        int b = 7;
        int expected = a + b;
        // when

        //then
        int outcome = mainApplication.calcAdd (a, b);
        Assert.assertEquals (expected, outcome);

    }


    @Test
    public void testcalcSub() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 3;
        int b = 1;
        int expected = a - b;
        // when

        //then
        int outcome = mainApplication.calcSub(a, b);
        Assert.assertEquals (expected, outcome);

    }
    @Test
    public void testcalcSub1() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 7;
        int b = 5;
        int expected = a - b;
        // when

        //then
        int outcome = mainApplication.calcSub(a, b);
        Assert.assertEquals (expected, outcome);

    }
    @Test
    public void testcalcSub2() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 6;
        int b = 3;
        int expected = a - b;
        // when

        //then
        int outcome = mainApplication.calcSub(a, b);
        Assert.assertEquals (expected, outcome);

    }

    @Test
    public void testcalcPosNeg() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 10;
        // when
        int expected = a * -1;
        //then
        int outcome = mainApplication.calcPosNeg(a);
        Assert.assertEquals (expected, outcome);

    }
    @Test
    public void testcalcPosNeg1() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 20;
        // when
        int expected = a * -1;
        //then
        int outcome = mainApplication.calcPosNeg(a);
        Assert.assertEquals (expected, outcome);

    }
    @Test
    public void testcalcPosNeg2() {
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 3;
        // when
        int expected = a * -1;
        //then
        int outcome = mainApplication.calcPosNeg(a);
        Assert.assertEquals (expected, outcome);

    }




}
