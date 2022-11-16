public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;
        System.out.print("Isso é milhar " + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;


        final double VALOR_DE_PI = 3.14; 
        
        System.out.print("é assim que se declara uma const " + VALOR_DE_PI);
    }
}
