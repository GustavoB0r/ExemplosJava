package Exemplos;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
     
        Scanner intScanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = intScanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = intScanner.nextInt();

        if (n1 > n2) {
            System.out.println("o primeiro numero e maior");               //se n1 for maior que n2, entao ira imprimir essa opçao

        } else if (n1 == n2) {
            System.out.println("os numeros sao iguais");                   //se o n1 for igual n2, entao ira imprimir essa opçao2

        } else {
            System.out.println("o segundo numero e maior");                //se n1 for menor que n2, entao ira imprimir essa opçao
        }

        intScanner.close();
    }
}
