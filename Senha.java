
package com.mycompany.senha;
import java.io.Console;
import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {
        Console console = System.console();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Nome de usuário: ");
            String user = scan.nextLine();
            
            System.out.println("Senha: ");
            char[] passChars = console.readPassword();
            String pass = new String(passChars);
            
            if (!pass.equals(user)) {
                System.out.println("Bem Vindo!");
                break;
            } else {
         System.out.println("Usuário ou senha inválida! Tente novamente.");
            }
        }
        
        scan.close();
        
    }
}
