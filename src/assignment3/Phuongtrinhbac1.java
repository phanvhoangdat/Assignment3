/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class Phuongtrinhbac1 {
    public static void main(String[] args) {
         double a,b,x = 0; // khai bao a , b va nghiem x 
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap vao a : ");
         a = sc.nextDouble();
         System.out.println("Nhap vao b : ");
         b = sc.nextDouble();
         if ( a == 0 ){ // Nếu a = 0 
             if( b == 0 ){ // Nếu a và b = 0 
                 System.out.println("Phuong trinh vo so nghiem ");
             }else { // Nếu a = 0 , b khác 0
                 System.out.println("Phuong trinh vo nghiem ");
             }
         }else{
             x = -b/a;
             System.out.println("Nghiem cua phuong trinh la " + x);
         }
         
    }
 
   
    
    
    
}
