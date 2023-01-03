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
public class Lesson02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khai bao biến, nhập xuất, cấu trúc if....
        int a,b;
        // Nhập giá trị
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a=");
        a=input.nextInt();
        System.out.println("Nhap bb=");
        b=input.nextInt();
        // 4 dạng if
        // Dạng 1: if đơn: nếu a>0  thì in ra b
        if(a>0){
            System.out.println("Gia trị b="+b);
        }
        // Dạng 2: if đầy đủ
        // Kiểm tra số a là số chẵn hay số lẻ
        if(a%2==0){
            System.out.printf("\n %d là số chẵn",a);
        }else{
            System.out.printf("\n %d là số lẻ",a);
        }
        // Dạng 3: if bậc thang if(..){...}else if(...){....
        // Kiểm tra số b là số dương, hay âm hay số 0
        if(b>0){
            System.out.println("\n" + b + " là số dương");
        }else if(b<0){
            System.out.println("\n" + b + " là số âm");
        }else{
            System.out.println("\n" + b + " là số 0");
        }
        // Dạng 4: if lồng nhau
        // Nếu a>0 => kiểm tra xem nếu b là chẵn thì in a+b
                    // ngược lại nếu b lẻ thì in a-b;
        if(a>0){
            if(b%2==0){
                System.out.printf("Tổng:%d",a+b);
            }else{
                System.out.printf("Hiệu:%d",a-b);
            }
        }
        
        //bài tập (10') -> Giải phương trình bậc nhất ax+b=0
    }
    
}
