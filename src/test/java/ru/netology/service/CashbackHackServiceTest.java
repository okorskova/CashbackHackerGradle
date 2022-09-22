package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldRemain1IfAmount999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain999IfAmount1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainNullIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);


        assertEquals(expected, actual);
    }
}