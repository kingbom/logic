package com.kingbom.logic;

public class DrawStar {

    public void drawDiamondWithNumberForLoop(int number) {
        for (int i = 0; i <= number; i++) {
            forLoopDrawWithNumber((number - i), " ");
            forLoopDrawWithNumber((i * 2) -1 , "*");
            System.out.println();
        }
    }

    public void forLoopDrawWithNumber(int number, String draw) {
        for (int j = 0; j < number; j++) {
            System.out.print(draw);
        }
    }

    public void drawDiamondWithNumberWhileLoop(int number) {
        int i = 0;
        while (i <= number) {
            whileLoopDrawWithNumber((number - i), " ");
            whileLoopDrawWithNumber((i * 2) -1 , "*");
            System.out.println();
            i++;
        }
    }

    public void whileLoopDrawWithNumber(int number, String draw) {
        int j = 0;
        while (j < number) {
            System.out.print(draw);
            j++;
        }
    }

    public void drawDiamondWithNumberDoWhileLoop(int number) {
        int i = 0;
        if (i <= number) {
            do {
                doWhileLoopDrawWithNumber((number - i), " ");
                doWhileLoopDrawWithNumber((i * 2) - 1, "*");
                System.out.println();
                i++;
            } while (i <= number);
        }
    }

    public void doWhileLoopDrawWithNumber(int number, String draw) {
        int j = 0;
        if (j < number) {
            do {
                System.out.print(draw);
                j++;
            } while (j < number);
        }
    }
}
