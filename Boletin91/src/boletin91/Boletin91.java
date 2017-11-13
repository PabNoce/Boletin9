/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin91;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int neg=0, pos=0, cer=0;
        for(int i=0;i<10;i++){
            int num=sc.nextInt();
            if (num==0) cer++;
            if (num<0) neg++;
            if (num>0) pos++;
        }
        System.out.println("ceros: "+cer+" positivos: "+pos+" negativos: "+neg);
    }
    
}
