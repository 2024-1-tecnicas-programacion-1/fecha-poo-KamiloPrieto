package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {

    //Metodo main
    //Complejidad temporal: O(1) Tiempo Constante.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Buen dia");
        System.out.println("Porfavor ingrese el dia, mes y año que desee.(una por una)");//O(1)
        int dia = sc.nextInt();//O(1)
        int mes = sc.nextInt();//O(1)
        int ano = sc.nextInt();//O(1)

        Fecha fechaUsuario = new Fecha(dia, mes, ano);//O(1)

        System.out.println(fechaUsuario.fechaCorta());
        if (fechaUsuario.validarFecha() == true) {
            System.out.println("La fecha es valida");//O(1)
            System.out.println(fechaUsuario.fechaLarga());//O(1)
        } else {
            System.out.println("La fecha no es valida");//O(1)
        }//Cierre if de validacion
        //O(1)

    }//Cierre main
}//Cierre class Principal
