

package com.mycompany.informacao;
import java.util.Scanner;
        
public class Informacao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome: (Maior que 3 caracteres):");
        String name = scan.nextLine();
        while (name.length()<= 3) {
            System.out.println("Nome inválido, tente novamente");
            name = scan.nextLine();
        }
        
        System.out.println("Idade:");
        int age = scan.nextInt();
        while (age > 150 || age < 0){
            System.out.println("Idade inválida. Tente novamente.");
            age = scan.nextInt();
        }
        
        System.out.println("Salário: ");
        double salary = scan.nextDouble();
        while (salary <= 0) {
            System.out.println("Salário inválido. Tente novamente");
            salary = scan.nextDouble();
        }
        
        System.out.println("Sexo (f/m): ");
        String sex = scan.nextLine();
        while (!sex.equals("f") && !sex.equals("m")) {
            System.out.println("Sexo inválido. Tente novamente.");
            sex = scan.nextLine();
            }
        
        System.out.println("Estado cívil (s/c/v/d): ");
        String status = scan.nextLine();
        while (!status.equals("s") && !status.equals("c") && !status.equals("v") && !status.equals("d")) {
            System.out.println("Estado civil inválido. Tente Novamente.");
            status = scan.nextLine();
        }
        
        scan.close();
    }
}
