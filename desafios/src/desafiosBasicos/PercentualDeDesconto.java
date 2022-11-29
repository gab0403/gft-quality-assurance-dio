package desafiosBasicos;
import java.util.Scanner;

public class PercentualDeDesconto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
            
        int M = input.nextInt();
        int S = input.nextInt();  
        
        //TODO:  Retorne o percentual de desconto que foi aplicado no produto
          int valorDescontado = (M-S);
    
          int percentualDeDesconto = (valorDescontado * 100) / M;
          System.out.println("O desconto foi de " + percentualDeDesconto + "%");
    }
}
