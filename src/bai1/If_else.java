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
public class If_else {

    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gt a: ");
        a = sc.nextFloat();
        System.out.println("Nhap vao gt b: ");
        b = sc.nextFloat();

        float x = a / b;//Tinh
        if (b != 0) {
            if (a == 0) {
                System.out.println("Phuong trình vô số nghiệm!!!");
            } else {
                System.out.println("Phuong trình có nghiệm: " + x);
            }
        } else {
            System.out.println("Phuong trình vô nghiệm: ");
        }
    }

}
