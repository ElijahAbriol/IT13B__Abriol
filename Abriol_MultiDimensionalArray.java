/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author User
 */
public class Abriol_MultiDimensionalArray {
     public static void main(String[]args){
         
         int numbers[][]={
             
             {1,2,3,4},
             {5,6,7,8},
             {9,10,11,12}    
         };
    for (int e=0; e<numbers.length; e++){
        System.out.print ("The Elements in Row " + (e +1) + ": ");         
        for (int j = 0; j<numbers[e].length; j++) {           
            System.out.print(numbers[e][j] + " ");
        }
    System.out.println();
    }   
     }
    
}
