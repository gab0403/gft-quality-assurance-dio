package estruturasDeRepeticao;
import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial 
 * de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
            System.out.println("fatorial: ");
                int fatorial = scan.nextInt();

            int mult = 1;

            
            for (int i = fatorial; i >= 1; i--) {
                mult = mult * i; 
            }
            
            System.out.println(fatorial + "! " +  "= " + mult);
    }
}
