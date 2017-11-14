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
public class SerieB {
    public void print(int elements) {
        System.out.print("b) ");
        for (int i = 1; i < elements + 1; i++) {
            if (i%2 == 0) {
                System.out.print(" + "+i+" ");
            } else {
                System.out.print("- "+i+" ");
            }
        }
        System.out.print("\n");
    }
}
