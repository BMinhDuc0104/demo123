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
public class ThapSangNhi {
    public static void main(String[] args) {
        int n;
        String NhiPhan = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap số cần chuyển đổi: ");
        n=sc.nextInt();
        
        while(n>0){
            NhiPhan =(n%2)+ NhiPhan;
            n=n/2;
        }
        System.out.println("Chuyển đổi sang nhị phân là: "+NhiPhan);
    }
    
}
