package com.example.cnedujnux2020101369;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    @Test
    public void first_test()
    {
        BowlingGame game = new BowlingGame();
        for (int i = 0;i < 20;i++)
        {
            game.roll(0);
        }
        assertEquals(-1,game.score());
    }
}