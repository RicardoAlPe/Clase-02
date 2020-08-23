/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.clase03ejercicio02;

/**
 *
 * @author Ricar
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Profesor profe = new Profesor ("Ricardo", "Chalatenango","11/05/2001","M",25,"ING","PROGRAMADOR");
        System.out.println(profe.toString());
        
        Estudiante est = new Estudiante ("Stanley", "Chalatenango","18/01/2001","M",27,1400,"Ing. Sistemas y Computacion");
        System.out.println(est.toString());
        
        
    }
    
}
