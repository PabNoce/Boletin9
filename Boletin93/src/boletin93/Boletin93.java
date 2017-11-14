/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin93;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0, base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una base");
         num = sc.nextInt();
        while (num < 0) {
            num = sc.nextInt();
            System.out.println("Introduce una base positiva");
        }
        base = num;
        num = 0;
         System.out.println("Introduce una altura");
          num = sc.nextInt();
        while (num < 0) {
            num = sc.nextInt();
            System.out.println("Introduce una altura positiva");
        }
        altura = num;
        Rectangulo rectangulo=new Rectangulo(base, altura);
        System.out.println("Area: "+rectangulo.CalculaArea());
    }
}


