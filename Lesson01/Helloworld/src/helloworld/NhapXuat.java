/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class NhapXuat {
    public static void main(String[] args) {
        // Nhập xuất với java
        // tạo đối tượng nhập
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Nhap a=");
        a= input.nextInt();
        System.out.print("Nhap b=");
        b= input.nextInt();
        
        // xuat
        System.out.printf("\n a=%d \n b=%d",a,b);
    }
}
