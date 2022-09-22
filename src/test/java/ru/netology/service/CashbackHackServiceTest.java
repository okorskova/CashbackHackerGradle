package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain1IfAmount999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain999IfAmount1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainNullIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}