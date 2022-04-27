/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author Minh Duc
 */
public class Test {
//
//    public static void main(String[] args) {
//   
//        Scanner sc = new Scanner(System.in);
// 
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Nhap vao");
//            i = sc.nextInt();
//            
//            if (i > 50) {
//                System.out.println(i+"hihi");
//            } else {
//                System.out.println(i+"Haha");
//            }
//        }
//    }
//}

//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Nhap gia trị i cần ktra: ");
//            i = sc.nextInt();
//        if(i>=0){
//                    System.out.println(i+" là số nguyên dương");
//                } else{
//                    System.out.println(i+" là số nguyên âm");
//                }
//    }
//                
//    }
//}
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a");
        a = sc.nextFloat();
        System.out.println("Nhap vao so b");
        b = sc.nextFloat();
        System.out.println("Nhap vao so c");
        c = sc.nextFloat();
        if (a + b > c && a + c > b && b + c > a) {
            if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println("Tam giác abc là tam giác vuông");
            } else if ((a == b) && (b == c)) {
                System.out.println("Tam giác abc là tam giác đều");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giác abc là tam giác cân");

            }

        } else {
            System.out.println("Đây ko phải là tam giác !!!");
        }
    }
}
