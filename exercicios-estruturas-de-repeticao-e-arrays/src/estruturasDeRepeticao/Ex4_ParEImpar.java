package estruturasDeRepeticao;
import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros.
 * Calcule e mostre a quantidade de números pares 
 * e a quantidade de números impares.
 */

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeNumeros;
        int numero;
        int count = 0;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
            quantidadeDeNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
                numero = scan.nextInt();
                count++;
            if(numero % 2 == 0) quantPares++;
            else quantImpares++;
            
        } while (count < quantidadeDeNumeros);
        System.out.println("Quantidade de par: " + quantPares);
        System.out.println("Quantidade de impar: " + quantImpares);
    }
}
