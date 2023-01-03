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
public class SwitchDemo {

    public static void main(String[] args) {
        // switch case ....
        // syntax:
        /*
        switch(expression){
            case value1:
                statement 1;
                break;
            case value2:
                statement 2;
                break;
            ...
            [default:
                statement n+1;
                break;]
        }
         */
        // nhập vào một số nguyên (1-7)
        // In ra thứ trong tuần tương ứng bằng tiếng việt
        int thu;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập thu=");
        thu = input.nextInt();
        switch (thu) {
            case 1:
                System.out.println(thu + " - Chủ nhật");
                break;
            case 2:
                System.out.println(thu + " - Thứ hai");
                break;
            case 3:
                System.out.println(thu + " - Thứ ba");
                break;
            case 4:
                System.out.println(thu + " - Thứ tư");
                break;
            case 5:
                System.out.println(thu + " - Thứ năm");
                break;    
            case 6:
                System.out.println(thu + " - Thứ sáu");
                break; 
            case 7:
                System.out.println(thu + " - Thứ bảy");
                break;
            default:
                System.out.println("Bạn nhập sai....");
        }
        
        // 1. nhập vào một số có 2 chữ số
        // => đọc thành lời việt: 
        /*
            10=> Mười
            20=> Hai mươi
            25=> Hai mươi lăm
            99=> Chín mươi chín
        */
        //2. Nhập vào tháng, năm, => in ra số ngày trong tháng năm đó
        /*
            thang=12
            nam=2022
            => Tháng 12 năm 2022 có 31 ngày.
        */
    }
}
