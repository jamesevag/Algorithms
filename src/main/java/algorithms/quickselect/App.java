package main.java.algorithms.quickselect;

public class App {


    public static void main(String args[]) {

        int num[] = {1, 5, 4, 8, -2};

        Quickselect quickselect = new Quickselect(num);
        System.out.print(quickselect.select(3));
    }
}
