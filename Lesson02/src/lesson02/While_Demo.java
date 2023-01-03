/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 * syntax:
 * while(expression_condition){
 *      statement-true;
 * }
 * 
 */
public class While_Demo {
    public static void main(String[] args) {
//        System.out.println("Dãy:");
//        int i=0;
//        while(i<=10){
//            System.out.printf("%4d",i);
//            i++;
//        }
        
        boolean flag = false;
        while(flag=!flag){
            System.out.println(flag);
        }
        System.out.println("out-while:" + flag);
        // true|false
        flag = false; // true
        while(!flag){
            System.out.println(flag);
        }
        System.out.println("out-while:" + flag);
        
    }
}
