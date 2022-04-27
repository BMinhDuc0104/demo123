
package bai1;

import java.util.Scanner;

/**
 *
 * @author Minh Duc
 */
public class VongLapWhile {

    public static void main(String[] args) {
        int x=1;
        Scanner sc = new Scanner(System.in);
        while (x != 0) {

            System.out.println("Nhap 1 giá tri mong muốn");
            System.out.println("Nhap 0 để thoát ctrinh!!!");
            x=sc.nextInt();
        }
        System.out.println("----END-----");
    }
}
