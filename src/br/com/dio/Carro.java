package br.com.dio;

public class Carro extends Veiculo{
    private String modelo;
    private String cor;
    private int capacidadeTanque;

    /*Construtor*/
    public Carro() {
    }

    /*Construtor*/
    public Carro(String modelo, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Double calcularTanque(double valorGasolina) {

        return valorGasolina * capacidadeTanque;
    }
}
