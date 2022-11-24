package estruturasDeRepeticao;
import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inválido e 
 * continue pedindo até que o usuário informe um valor válido.
 */

public class Ex2_Nota {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;

            while(true) {
                System.out.println("Nota: ");
                nota = scan.nextInt(); // método nextInt() retorna um inteiro.
                if(nota <= 10 || nota == 0) {
                    break;
                } else {
                    System.out.println("Nota inválida, digite novamente.");
                }
            }
        }
    }
}
