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
public class GiaiPTBacHai {
    public static void main(String[] args) {
        // khai báo
        float a, b,c, x1,x2; // khai báo các biến hệ số, biến nghiệm
        // nhập hệ số
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a=");
        a= input.nextFloat();
        System.out.println("Nhập b=");
        b= input.nextFloat();
        System.out.println("Nhập c=");
        c= input.nextFloat();
        // giải phương trình
        if(a==0){ // đi giải phương trình bậc 1
            GiaiPTBacMot(b, c);
        }else{
            float delta=b*b-4*a*c;
            if(delta>0){
                x1 = (-b-(float)Math.sqrt(delta))/(2*a);
                x2 = (-b+(float)Math.sqrt(delta))/(2*a);
                System.out.println("Nghiệm x1="+x1);                System.out.println("Nghiệm x1="+x1);
                System.out.println("Nghiệm x2="+x2);
            }else if(delta==0){
                System.out.println("Nghiệm kép x1= x2="+(-b)/(2*a));
            }else{
                System.out.println("Pt vô nghiệm");
            }
        }
    }
    static void GiaiPTBacMot(float a, float b){
        if(a==0){
            if(b==0){
                System.out.println("Pt vô số nghiệm");
            }else{
                System.out.println("Pt Vô Nghiệm");
            }
        }else{ // a!=0
            System.out.printf("\nPt Có nghiệm x=%.2f",-b/a);
        }
    }
}
