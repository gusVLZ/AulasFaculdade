package br.usjt.aula2;

import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Digite o número do ex que quer acessar:");
        opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                MediaNotas.avg();
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }
}
