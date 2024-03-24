

package com.mycompany.nota;

import java.util.Scanner;


public class Nota {
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a nota: ");
        while (true) {
            System.out.println("Insira a nota: ");
            int nota = scan.nextInt();
            if (nota >= 0 && nota <= 10) {
                System.out.println("Sua Nota: " + nota);
                break;
            } else {
                System.out.println("Nota Inválida, tente novamente: ");
            }
        }
        
        scan.close();
    }
}
