/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin96;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numTotal = 0, numMas = 0, numMenos = 0, soldo;
        do {
            soldo = sc.nextInt();
            if (soldo >= 0) {
                numTotal++;
                if (soldo >= 1000 && soldo <= 1750) {
                    numMas++;
                } else {
                    if (soldo < 1000&&soldo!=0) {
                        numMenos++;
                    }
                }

            } else {
                System.out.println("No se admiten soldos negativos");
            }
        } while (soldo != 0);
        System.out.println(numMas+" gañan entre 1000 e 1750");
        System.out.println(numMenos*100/numTotal+"% gañan menos de 1000");
    }

}
