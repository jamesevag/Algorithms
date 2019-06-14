package main.java.algorithms.maxsquare;

public class MaxSquare {


    public int findMaxSquare(int a, int b) {

        int nop = 0;

        a = (int)Math.ceil(Math.sqrt(a));
        b = (int)Math.floor(Math.sqrt(b));

        while(b >= a) {

            a = (int)Math.ceil(Math.sqrt(a));
            b = (int)Math.floor(Math.sqrt(b));
            nop = nop +1;
        }
        return nop;
    }
}
