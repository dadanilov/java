/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_3;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b;
        a = 3;
        b = 2;
        System.out.println("Сумма "+(a + b));
        System.out.println("Разность "+(a - b));
        System.out.println("Произведение "+(a * b));
        System.out.println("Частное "+((double) a / b));      
        System.out.println("Инкремент "+(++a));
        System.out.println("Декремент "+(--a));
        System.out.println(a+" + 5 = "+(a += 5));
        int c = 6;
        c = c + 8;
        System.out.println(c+" % "+3+" = "+c % 3);
    }
    
}
