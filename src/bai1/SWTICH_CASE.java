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
public class SWTICH_CASE {

    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap đáp án: ");
        m = sc.nextInt();
        switch (m) {
            case 1: {
                System.out.println("Có");
                break;
            }
            case 2: {
                System.out.println("Ko");
                break;
            }
            case 3: {
                System.out.println("Có cái Lìn");
                break;
            }
            default: {
                System.out.println("Chọn đáp án đi!!!");
            }

        }
    }
}
