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
public class Lab01_02 {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập tên của bạn");
        String tenCuaBan;
        Scanner input = new Scanner(System.in);
        tenCuaBan = input.nextLine();
        
        System.out.println("Chào bạn," + tenCuaBan + ", chúc tốt lành!");
        
    }
}
