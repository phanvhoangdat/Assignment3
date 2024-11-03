/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class Phuongtrinhbac2 {

    public static void main(String[] args) {
        double a, b, c, x1, x2 = 0, delta;
        // khai bao cac bien co trong phuong trinh 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a : ");
        a = sc.nextDouble();
        System.out.println("Nhap vao b : ");
        b = sc.nextDouble();
        System.out.println("Nhap vao c : ");
        c = sc.nextDouble();
        // nhap a , b , c vao tu ban phim
        delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            System.out.println("Nhap du lieu sai ");
        } else {
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem !! "); // delta < 0
            } else if (delta == 0) { // delta = 0 
                x1 = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x1=x2= " + x1);
            } else {
                // delta > 0 
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem ");
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            }
        }
    }
}
