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
public class SerieA {

    public void print(int elements) {
        System.out.print("a) ");
        for (int i = 1; i < elements + 1; i++) {
            if (i == elements) {
                System.out.print((2 * i) + "\n");
            } else {
                System.out.print(2 * i + " + ");
            }
        }
    }
}
