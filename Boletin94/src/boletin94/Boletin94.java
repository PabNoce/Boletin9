/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin94;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = 1;
        while (num != 0) {
            num = sc.nextInt();
            System.out.println("Tabla de multiplicar del " + num);
            for (int i = 1; i < 11; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}
