package metodos;

public class Carro {
    String cor;
    int modelo;
    int portas;
    int rodas;

    Carro(String cor, int modelo, int portas) {
        this.cor = cor;
        this.modelo = modelo;
        this.portas = portas;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    int getModelo() {
        return modelo;
    }


    void setPortas(int portas) {
        this.portas = portas;
    }

    int getPortas() {
        return portas;
    }
}
