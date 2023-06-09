package com.example.cnedujnux2020101369;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void first_test()
    {
        repeatedRoll(0, 20);
        assertEquals(0,game.score());
    }

    @Test
    public void second_test()
    {
        repeatedRoll(1,20);
        assertEquals(20,game.score());
    }

    private void repeatedRoll(int pin, int times)
    {
        for (int i = 0;i < times;i++)
        {
            game.roll(pin);
        }
    }

    @Test
    public void third_test()
    {
        rollASpare();
        game.roll(7);
        game.roll(1);
        repeatedRoll(0,16);
        assertEquals(25,game.score());
    }

    private void rollASpare() {
        game.roll(4);
        game.roll(6);
    }

    @Test
    public void fourth_test()
    {
        rollAStrike();
        game.roll(4);
        game.roll(1);
        repeatedRoll(0,16);
        assertEquals(20,game.score());
    }

    private void rollAStrike() {
        game.roll(10);
    }

    @Test
    public void fifth_test()
    {
        repeatedRoll(10,10);
        repeatedRoll(5,2);
        assertEquals(285,game.score());
    }

}