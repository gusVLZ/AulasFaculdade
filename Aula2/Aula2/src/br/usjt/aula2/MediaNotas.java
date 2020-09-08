package br.usjt.aula2;

import java.util.*;

public class MediaNotas {
    public static void avg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 notas para obter a média aritmética");
        System.out.println((sc.nextDouble() + sc.nextDouble() + sc.nextDouble()) / 3);
        sc.close();
    }
}