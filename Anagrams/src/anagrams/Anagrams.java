/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Garcia
 */
public class Anagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read =  new Scanner (System.in);
        System.out.println("Enter the first phrase");
        String first = read.nextLine();
        System.out.println("Enter the second phrase");
        String second = read.nextLine();
       
        first = first.replace(" ", "");
        char phrase1 []= first.toCharArray();
        Arrays.sort(phrase1);
        second = second.replace(" ", "");
        char phrase2 []= second.toCharArray();
        Arrays.sort(phrase2);
        
        if(phrase1.length != phrase2.length){
            System.out.println("The Phrase are not anagrams");
            System.exit(0);
            
        } 
        boolean ok = false;
        for (int i=0; i<phrase1.length; i++){
            if (phrase1[i] != phrase2[i]){
                System.out.println("The Phrase are not anagrams");
                System.exit(0);
            }else{
                ok = true;
            }
            
        }
        if (ok == true){
            System.out.println("Congratuletions The Phrase are  anagrams");
        }
        
        /*if(phrase1[i] == phrase2[i] || i == phrase1.length || i == phrase2.length ){
            System.out.println("Congratuletions The Phrase are  anagrams");
        }else {
            System.out.println("The Phrase are not anagrams");
        }*/
        
        
    }
    
}
