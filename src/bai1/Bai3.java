    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Minh Duc
 */
import java.util.Scanner;

public class Bai3 { //Nhập dữ liệu từ bàn phím

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Nhập dữ liệu từ bàn phím 

        System.out.println("Nhap ho va ten:  ");
        String Hovaten = sc.nextLine();

        System.out.println("Nhap so tuoi:  ");
        int Tuoi = sc.nextInt();

        System.out.println("Nhap can nang:  ");
        float Weight = sc.nextFloat();

        System.out.println("THONG TIN SINH VIEN");
        System.out.println("-------------------");
        System.out.println("Họ và tên: " + Hovaten);
        System.out.println("Tuổi: " + Tuoi);
        System.out.println("Cân nặng:" + Weight);
    }

}
