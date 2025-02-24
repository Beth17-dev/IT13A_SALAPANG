/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

/**
 *
 * @author User
 */
public class lab_act1_arithmetics {
    
   public static void main(String[] args) {
       int A = 10;
       int B = 4;
       int C = 6;
       int D = 3;
       
       int beth = A * B + C;
       int pril = (A - B) % C;
       int gab = (A + B + C) / D;
       int john = A * C - (B * B);
       
       System.out.println("10 * 4 + 6 = " + beth);
       System.out.println("(10 - 4) % 6 = " + pril);
       System.out.println("(10 + 4 + 6) / 3 = " + gab);
       System.out.println("10 * 6 - (4 * 4) =" + john);
      
      
   }
}
