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
public class MANG {

    public static void main(String[] args) {
        double A[];
        double tong = 0;
        A = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.println("Nhap phan tu thứ " + i);
            A[i] = sc.nextDouble();
        }
        for (int i = 0; i < A.length; i++) {
            tong += A[i];
            
        }
        System.out.println("Tong: " + tong);
    }
}
