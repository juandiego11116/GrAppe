/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grappe;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Garcia
 */
public class punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TODO code application logic here
        Scanner read =  new Scanner (System.in);
        System.out.println("Enter the first number");
        int first = read.nextInt();
        System.out.println("Enter the second  number");
        int second = read.nextInt();
        System.out.println("Enter the third  number");
        int third = read.nextInt();
        System.out.println("Enter the fourth  number");
        int fourth = read.nextInt();
        System.out.println("enter the result to find");
        int result = read.nextInt();
        
        String operation[];
        operation = new String[82];
        operation [0] = "+,+,+";
        operation [1] ="+,+,-";
        operation [12] ="+,+,/";
        operation [3] ="+,+,*";
        operation [4] ="+,-,+";
        operation [5] ="+,-,-";
        operation [6] ="+,-,/";
        operation [7] ="+,+,/";
        operation [8] ="+,-,*";
        operation [9] ="+,/,+";
        operation [10] ="+,/,-";
        operation [11] ="+,/,/";
        operation [2] ="+,/,*";
        operation [13] ="+,*,+";
        operation [14] ="+,*,-";
        operation [15] ="+,*,/";
        operation [16] ="+,*,*";
        operation [17] ="+,+,+";
        operation [18] ="+,+,-";
        operation [19] ="+,+,/";
        operation [20] ="+,+,*";
        operation [21] ="+,-,+";
        operation [22] ="+,-,-";
        operation [23] ="+,-,/";
        operation [24] ="+,-,*";
        operation [25] ="+,/,+";
        operation [26] ="+,/,-";
        operation [27] ="+,/,/";
        operation [28] ="+,/,*";
        operation [29] ="+,*,+";
        operation [30] ="+,*,-";
        operation [31] ="+,*,/";
        operation [32] ="+,*,*";
        operation [33] ="-,+,+";
        operation [34] ="-,+,-";
        operation [35] ="-,+,/";
        operation [36] ="-,+,*";
        operation [37] ="-,-,+";
        operation [38] ="-,-,-";
        operation [39] ="-,-,/";
        operation [40] ="-,-,*";
        operation [41] ="-,/,+";
        operation [42] ="-,/,-";
        operation [43] ="-,/,/";
        operation [44] ="-,/,*";
        operation [45] ="-,*,+";
        operation [46] ="-,*,-";
        operation [47] ="-,*,/";
        operation [48] ="-,*,*";
        operation [49] ="/,+,+";
        operation [50] ="/,+,-";
        operation [51] ="/,+,/";
        operation [52] ="/,+,*";
        operation [53] ="/,-,+";
        operation [54] ="/,-,-";
        operation [55] ="/,-,/";
        operation [56] ="/,-,*";
        operation [57] ="/,/,+";
        operation [58] ="/,/,-";
        operation [59] ="/,/,/";
        operation [60] ="/,/,*";
        operation [61] ="/,*,+";
        operation [62] ="/,*,-";
        operation [63] ="/,*,/";
        operation [64] ="/,*,*";
        operation [65] ="*,+,+";
        operation [66] ="*,+,-";
        operation [67] ="*,+,/";
        operation [68] ="*,+,*";
        operation [69] ="*,-,+";
        operation [70] ="*,-,-";
        operation [71] ="*,-,/";
        operation [72] ="*,-,*";
        operation [73] ="*,/,+";
        operation [74] ="*,/,-";
        operation [75] ="*,/,/";
        operation [76] ="*,/,*";
        operation [77] ="*,*,+";
        operation [78] ="*,*,-";
        operation [79] ="*,*,/";
        operation [80] ="*,*,*";
        int  ok = 0;
        int i=0;
        while (ok==0){
        String[] elementos;
        elementos = operation[i].split(",");
        float resultado = 0;
        if (null != elementos[0])switch (elementos[0]) {
                case "+":
                    resultado = resultado + (first + second);
                    break;
                case "-":
                    resultado = resultado + (first - second);
                    break;
                case "/":
                    resultado = resultado + (first / second);
                    break;
                case "*":
                    resultado = resultado + (first * second);
                    break;
                default:
                    break;
            }
                if (null != elementos[1])switch (elementos[1]) {
                case "+":
                    resultado = resultado + third;
                    break;
                case "-":
                    resultado = resultado - third;
                    break;
                case "/":
                    resultado = resultado / third;
                    break;
                case "*":
                    resultado = resultado * third;
                    break;
                default:
                    break;
            }
                if (null != elementos[2])switch (elementos[2]) {
                case "+":
                    resultado = resultado + fourth;
                    break;
                case "-":
                    resultado = resultado - fourth;
                    break;
                case "/":
                    resultado = resultado / fourth;
                    break;
                case "*":
                    resultado = resultado * fourth;
                    break;
                default:
                    break;
            }
                if (resultado == result){
                    ok= ok+1;
                    System.out.println(first+ elementos[0]+second+elementos[1]+third+ elementos[2]+fourth +"="+ result);
                    
                }
                i++;
        
    }
          
        
        
    }   
        
        
        
    }
   // system.out.println("Esto sale en pantalla\n");
    
    

