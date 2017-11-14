/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin93;

/**
 *
 * @author pnocedalopez
 */
public class Rectangulo {
    int base, altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public float CalculaArea(){
        return base*altura;
    }
}
