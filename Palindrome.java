/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter a word: ");
        String input =in.nextLine().toLowerCase();
        
        String reversed="";
         
         for(int i= input.length()-1; i>=0; i--){
        reversed += input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.print(input+ " It is a palindrome ");
        } else {
            System.out.print(input+ "It is not a palindrome ");
 
      
        }
    }
    
}
