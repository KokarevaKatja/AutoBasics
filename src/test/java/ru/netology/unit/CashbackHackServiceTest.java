package ru.netology.unit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalcRemainIfAmount800() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount50() {

        CashbackHackService service = new CashbackHackService();
        int amount = 50;

        int actual = service.remain(amount);
        int expected = 950;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount999() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount1001() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount2000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount0() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcRemainIfAmount1500() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        Assertions.assertEquals(actual, expected);
    }
}
