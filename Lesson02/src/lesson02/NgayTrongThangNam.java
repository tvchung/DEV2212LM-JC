/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class NgayTrongThangNam {
    public static void main(String[] args) {
        int thang, nam, soNgay=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Tháng=");
        thang=input.nextInt();
        System.out.println("Năm=");
        nam=input.nextInt();
        switch(thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay=30;
                break;
            case 2:
                if((nam%4==0 && nam%100!=0) || nam%400==0){
                    soNgay=29;
                }else{
                    soNgay=28;
                }
                break;
            default:
                System.out.println("Bạn nhập sai...");
        }
        if(soNgay>0){
            System.out.printf("\n Tháng %d năm %d có %d ngày",thang,nam, soNgay);
        }
    }
}
