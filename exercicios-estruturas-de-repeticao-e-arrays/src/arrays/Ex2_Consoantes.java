package arrays;

import java.util.Scanner;

/*
 * Faça um Programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas. Imprima as consoantes.
 */
// consoantes
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] vetor = new String[6];

        int consoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") | 
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") | 
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                vetor[count] = letra;
                consoantes++;
            }

            count++;
        } while (count < vetor.length);

        for (String consoante : vetor) {
            if(consoante != null){
                System.out.println(consoante);
            }
        }

        System.out.println("Quantidade de consoantes: " + consoantes);
    }
}
