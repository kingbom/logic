package com.kingbom.logic;

public class DrawStar {

    //Start solution for loop increment and decrement
    public void drawDiamondWithNumberForLoop(int number) {
        for (int i = 1; i <= number; i++) {
            int incrementWhiteSpace =  (number - i);
            int incrementStar = (i * 2) -1 ;
            forLoopDrawWithNumber(incrementWhiteSpace, " ");
            forLoopDrawWithNumber(incrementStar, "*");
            System.out.println();
        }

        for (int i = 1; i <= number; i++) {
             forLoopDrawWithNumber(i, " ");
             int decrementStar = ((number - i) * 2) - 1;
             revertForLoopDrawWithNumber(decrementStar, "*");
             System.out.println();
        }
    }


    public void forLoopDrawWithNumber(int number, String draw) {
        for (int j = 1; j <= number; j++) {
            System.out.print(draw);
        }
    }

    public void revertForLoopDrawWithNumber(int number, String draw) {
        for (int j = number; j > 0; j--) {
            System.out.print(draw);
        }
    }
    //End solution for loop increment and decrement

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
