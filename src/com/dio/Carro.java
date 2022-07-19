package com.dio;

public class Carro {

    public static void main(String[] args) {
        Carro carro1 = new Carro("rosa","uno",75 ){};
        System.out.println(carro1);
        System.out.println(carro1.totalValorTanque(6.6));
    }

    String cor;
    String modelo;
    int capacidadeTanque;

    Carro (String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }

    //calcular capacidade do tanque
    Double totalValorTanque (double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }
}


