/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Minh Duc
 */
public class GPTbac2 {

    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gt cua a la:");
        a = sc.nextDouble();
        System.out.println("Nhap vao gt cua b la:");
        b = sc.nextDouble();
        System.out.println("Nhap vao gt cua c la:");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        if(a!=0){
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm!!!");
        } else if (delta == 0) {
            x1 = -b / 2 * a;
            System.out.println("Pt có nghiệm kép: " + x1);
        } else {
            x1 = (-b - Math.sqrt(delta)) / 2 * a;
            x2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("Pt có 2 nghiệm pb: ");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
        }else{
            if(b!=0){
                x1=c/b;
                System.out.println("Pt co nghiệm: "+x1);
            } else{
                System.out.println("Pt vo ngiệm!!!");
            }
        }

    }  
}
