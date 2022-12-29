/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class SinhVien {
    public static void main(String[] args) {
         // Khai bao cac bien
        String tenSinhVien;
        int tuoi;
        float diemLyThuyet, diemThucHanh, diemTrungBinh;
        // Nhap
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tên sinh viên:");
        tenSinhVien= input.nextLine();
        System.out.println("Nhập tuổi:");
        tuoi=input.nextInt();
        System.out.println("Nhập điểm lý thuyết");
        diemLyThuyet = input.nextFloat();
        System.out.println("Nhập điểm thực hành");
        diemThucHanh = input.nextFloat();
        // Tính điểm trung bình
        diemTrungBinh = (diemLyThuyet+diemThucHanh)/2;
        // in
        System.out.println("Xin chào," + tenSinhVien + "\n Tuổi:" + tuoi);
        System.out.println("Điểm trung bình:" + diemTrungBinh);
    }
}
