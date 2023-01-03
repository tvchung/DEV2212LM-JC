/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 * systax:
 * do{
 *      statement - true;
 * }while(condition);
 */
public class DoWhile_Demo {
    public static void main(String[] args) {
        System.out.println("Dãy:");
        int i=0;
        do{
            System.out.printf("%4d",i);
            i++;
        }while(i<=10);
    }
}
