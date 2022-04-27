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
public class Bai4 { //Thực hiện các phép toán cơ bản  

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gt của a: ");
        a = sc.nextInt();
        System.out.println("Nhap vao gt của b: ");
        b = sc.nextInt();

        int tong = a + b;
        System.out.println(a + "+" + b + "= " + tong);
        int hieu = a - b;
        System.out.println(a + "-" + b + "= " + hieu);
        float thuong = (float) a / b;// Ép kiểu 
        System.out.println(a + "/" + b + "= " + thuong);
    }
    
}
