package com.uip;
//Programa que analiza si adivinas un numero entre 1 y 100
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {





    public static void main(String[] args) throws Exception {
        //Declaracion de variables
        int intentos, n;
        final int z = 20;

        System.out.println("LABORATORIO");
        System.out.println("-----------");
        System.out.println("Piensa en un numero entre 1 y 100. Adivina cual es. Tienes 3 chances.");

        //Condicion de ejecucion
        for (intentos=1; intentos<=3; intentos=intentos + 1) {
             System.out.println("Chance # " + intentos);
             System.out.print("Introduce tu numero: ");

             BufferedReader k= new BufferedReader(new InputStreamReader(System.in));
             //Entrada por teclado
             n= Integer.parseInt(k.readLine());

                 if (n==z) {
                     System.out.println("Bien. Lo adivinaste");
                     break;

                 } else {

                    if (n<=15) {
                        System.out.println("Demasiado bajo");
                 }

                    else {
                        if (n>= 30) {
                            System.out.println("Demasiado alto");
                        }
                    }
                 }
            }

        }

        // write your code here
    }


