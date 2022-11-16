package edu.gabi.classes;
public class MinhaClasse {
  public static void main(String [] args) {
    
    String primeiroNome = "Gabi";
    String segundoNome = "R";
    // int idade = 22;
    // boolean verdadeiro = true;

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.print(nomeCompleto);
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
