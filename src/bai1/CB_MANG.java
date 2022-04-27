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
public class CB_MANG {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap i phan tu:");
        i = sc.nextInt();

        double mang1[];
        mang1 = new double[i];

        for (int j = 0; j < mang1.length; j++) {
            System.out.println("Nhap phan tu thu " +(j + 1 )+ ": ");
            mang1[j] = sc.nextDouble();
        }
        double tong = 0;
        for (int j = 0; j < mang1.length; j++) {
            tong += mang1[j];

        }
        System.out.println("Tong la: " + tong);
    }

}
