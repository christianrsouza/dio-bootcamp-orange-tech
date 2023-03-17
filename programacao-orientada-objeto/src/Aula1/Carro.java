package Aula1;
public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //contrutor mais simples
    Carro() {

    }
    //contrutor para receber os atributos da classe carro(sobrecarga)
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //get e set cor do carro
    void setCor(String cor) {
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }

    //get e set modelo
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo() {
        return modelo;
    }

    //get e set capacidade do tanque
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // metodo do total para encher o tanque 
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
