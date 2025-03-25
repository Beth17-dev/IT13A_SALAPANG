/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class lab_act1_arithmetics {
    
   public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numbers[]= new int[5];
        
        System.out.println("Enter 5 numbers:");
        
        for(i=0;i<numbers.length;i++) {
            System.out.println("Enter numbers "+(i+1)+" .");
            numbers[i]=scanner.nextInt();
        }
        
        int mostfrequent=numbers[0];
       
        
        

   }
}
