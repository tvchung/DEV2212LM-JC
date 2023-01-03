/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 * Loop:
 *      for
 *      while
 *      do...while
 *      foreach
 */
public class Loop_For_Demo {
    /*
    for:
    syntax:
    
        for(init ; expression_condition ; step ){
    
            statement block;
    
        }
    */
    public static void main(String[] args) {
        System.out.println("Dãy các số nguyên <=10");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%4d",i);
        }
        System.out.println("\nFinished");
        
        // Dạng 2: for khuyết
        System.out.println("Khuyết init\n");
        int i=0;
         for ( ; i <= 10; i++) {
            System.out.printf("%4d",i);
        }
        System.out.println("\nFinished");
        System.out.println("Khuyết condition\n");
        // i=0;
        for (i=0 ; ; i++) {
            if(i>10) 
                break;
            System.out.printf("%4d",i);
        }
        System.out.println("\nFinished");
        System.out.println("Khuyết condition\n");
        // i=0;
        for (i=0 ;i<=10 ; ) {
           System.out.printf("%4d",i);
           i++;
        }
        System.out.println("\nFinished");
        
        // Dạng 3: Khuyết toàn bộ
        System.out.println("Khuyết condition\n");
        i=0;
        for ( ; ; ) {
           if(i>10)
               break;
           System.out.printf("%4d",i);
           i++;
        }
        System.out.println("\nFinished");
        
        // Dạng 4: Không thân
        System.out.println("Không thân\n");
//        i=0;
        for (i=0 ;i<=10 ;System.out.printf("%4d",i),i++ ){}
        System.out.println("\nFinished");
    }
            
            
}
