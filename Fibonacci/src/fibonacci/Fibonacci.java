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
        Scanner read =  new Scanner (System.in);
        System.out.println("Enter 1 iterative Fibonacci or 2 recursive Fibonacci");
        int select = read.nextInt();
        System.out.println("Enter the maximum number of sequences you want to see");
        int max = read.nextInt();
    
    int first=1;
    int second=0;
    int ini = 0;
    System.out.println("1");
    if(select == 1){
    int result= fibonacci2(max, first, second, ini);
    }else if(select == 2){
    int result= fibonacci1(max, first, second, ini); 
    
    }
    }
   public static  int  fibonacci1(int max, int first, int second, int ini){
        int aux = first;
        
        if(ini != max){
            ini++;
            first = first + second;
            second = aux;
            System.out.println(first);
            fibonacci1(max,first,second,ini);
        }
        return first;
    }
    
    public static  int  fibonacci2(int max, int first, int second, int ini){
        
        
        while(ini != max){
            int aux = first;
            ini++;
            first = first + second;
            second = aux;
            System.out.println(first);
            
        }
        return first;
    }
}
