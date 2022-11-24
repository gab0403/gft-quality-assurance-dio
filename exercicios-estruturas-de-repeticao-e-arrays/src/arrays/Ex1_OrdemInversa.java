package arrays;
/*
 * Faça um Programa que leia um vetor 
 * de 5 números inteiros e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6 };

        
        int count = 0;
        while (count < vetor.length) {
            System.out.print(vetor[count]);
            count++;
        }
        
        System.out.println("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
