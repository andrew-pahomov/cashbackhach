package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(expected, actual);
    }
}