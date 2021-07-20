/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Garcia
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter 1 iterative Fibonacci or 2 recursive Fibonacci");
        int select = read.nextInt();
        System.out.println("Enter the maximum number of sequences you want to see");
        int maximum = read.nextInt();

        int first = 0;
        int second = 1;
        int initial = 0;
        System.out.println("0");
        if (select == 1) {
            fibonacciIterative(maximum, first, second, initial);
        } else if (select == 2) {
            fibonacciRecursive(maximum, first, second, initial);

        }
    }

    public static void fibonacciRecursive(int max, int first, int second, int initial) {
        
        if (initial != max) {
            int nextNumber = first + second;
            System.out.println(nextNumber);
            initial++;
            fibonacciRecursive(max, second, nextNumber, initial);
        }
       // return first;
    }

    public static void fibonacciIterative(int max, int first, int second, int initial) {

        while (initial != max) {
            int nextNumber = first + second;
            first = second;
            second = nextNumber;
            System.out.println(nextNumber);
            initial++;
        }
    }
}
