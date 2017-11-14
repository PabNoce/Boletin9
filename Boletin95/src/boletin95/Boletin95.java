/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin95;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la serie (a, b, c):\n");
        char serie = sc.next().charAt(0);
        int elements=sc.nextInt();
        switch (serie) {
            case 'a':
                SerieA seriea=new SerieA();
                seriea.print(elements);
                break;
            case 'b':
                  SerieB serieb=new SerieB();
                serieb.print(elements);
                break;
            case 'c':
                  SerieC seriec=new SerieC();
                seriec.print(elements);
                break;
            default:
                System.out.println("ERROR: serie inválida");
                break;
        }
    }

}
