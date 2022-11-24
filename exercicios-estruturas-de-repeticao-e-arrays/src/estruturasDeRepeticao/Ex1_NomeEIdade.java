package estruturasDeRepeticao;
import java.util.Scanner;

/*
small_orange_diamondNome e Idade: 
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e
o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nome;
            int idade;

            while(true) {
                System.out.println("Nome: ");
                nome = scan.next(); // método next() retorna uma string.
                if(nome.equals("0")) break;
   
                System.out.println("Idade: ");
                idade = scan.nextInt(); // método nextInt() retorna um inteiro.
            }
        }

    }
}
