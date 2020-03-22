package com.kingbom.logic;

public class DrawStar {

    //1. solution for loop increment and decrement
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

    //2. solution while loop increment and decrement
    public void drawDiamondWithNumberWhileLoop(int number) {
        int i = 0;
        while (i <= number) {
            whileLoopDrawWithNumber((number - i), " ");
            whileLoopDrawWithNumber((i * 2) -1 , "*");
            System.out.println();
            i++;
        }

        int j = 0;
        while (j <= number) {
            whileLoopDrawWithNumber(j, " ");
            revertWhileLoopWithNumber(((number -j) * 2) -1 , "*");
            System.out.println();
            j++;
        }
    }

    public void whileLoopDrawWithNumber(int number, String draw) {
        int j = 0;
        while (j < number) {
            System.out.print(draw);
            j++;
        }
    }

    public void revertWhileLoopWithNumber(int number , String draw){
        int j = number;
        while (j > 0) {
            System.out.print(draw);
            j--;
        }
    }
    //End solution while loop increment and decrement

    //3. solution do while loop increment and decrement
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

        int j = 0;
        if (j <= number) {
            do {
                doWhileLoopDrawWithNumber(j, " ");
                revertDoWhileLoopDrawWithNumber(((number - j) * 2) - 1, "*");
                System.out.println();
                j++;
            } while (j <= number);
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

    public void revertDoWhileLoopDrawWithNumber(int number, String draw) {
        int j = number;
        if (j > 0) {
            do {
                System.out.print(draw);
                j--;
            } while (j > 0);
        }
    }
    //End solution do while loop increment and decrement
}
