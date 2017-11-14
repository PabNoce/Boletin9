/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin95;

/**
 *
 * @author pnocedalopez
 */
public class SerieC {

    public void print(int elements) {
        System.out.print("c) ");
        int num1 = 0, numaux;
        int num2 = 1;
        for (int i = 0; i < elements; i++) {
            if (i == elements - 1) {
                System.out.print(num1 + "\n");
            } else {
                System.out.print(num1 + ",");
            }
            numaux = num1 + num2;
            num1 = num2;
            num2 = numaux;
        }
    }
}
