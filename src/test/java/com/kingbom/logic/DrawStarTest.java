package com.kingbom.logic;

import org.junit.Before;
import org.junit.Test;

public class DrawStarTest {

    private DrawStar drawStar;

    @Before
    public void setUp() throws Exception {
        drawStar = new DrawStar();
    }

    @Test
    public void givenDrawStar_whenDiamondInputNumberSix_forLoop() {
        drawStar.drawDiamondWithNumberForLoop(6);
    }

    @Test
    public void givenDrawStar_whenDiamondInputNumberSix_whileLoop() {
        drawStar.drawDiamondWithNumberWhileLoop(6);
    }

    @Test
    public void givenDrawStar_whenDiamondInputNumberSix_doWhileLoop() {
        drawStar.drawDiamondWithNumberDoWhileLoop(6);
    }
}
