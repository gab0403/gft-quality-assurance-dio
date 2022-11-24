package desafiosBasicos;
import java.util.Scanner;

public class AFilaDoBanco {
    public static void main(String[] args) { 
 
        String[] nomesFila = new String[3]; 
        Scanner nome = new Scanner(System.in);
        int posicao = 0;
    
     //TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:
              for (String nomes : nomesFila) {
                nomes = nome.next();
                posicao++;
                System.out.println(nomes + "esta na posicao: " + posicao);
              }
      
      } 
}