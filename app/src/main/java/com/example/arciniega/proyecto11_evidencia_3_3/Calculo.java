package com.example.arciniega.proyecto11_evidencia_3_3;

/**
 * Created by arciniega on 06/07/16.
 */
public class Calculo {
    private double val1;
    private double result;
    private String res;
    private String seleccion;
    private String valorDivisa;

    public String getValorDivisa() {
        return valorDivisa;
    }

    public void setValorDivisa(String valorDivisa) {
        this.valorDivisa = valorDivisa;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public Calculo() {

    }

    public void mostrarConversion(){
        switch (seleccion){
            case "MXN - Dólar":
                    result = val1 * 0.053;
                    res = String.valueOf("$" + result + " Dólares");
                    valorDivisa = "Se calcula el MXN a $0.053 Dólar";
                break;
            case "MXN - Euro":
                    result = val1 * 0.058;
                    res = String.valueOf("$" + result + " Euros");
                    valorDivisa = "Se calcula el MXN a $0.058 Euro";
                break;
            case "Dólar - Euro":
                    result = val1 * 0.90;
                    res = String.valueOf("$" + result + " Euros");
                    valorDivisa = "Se calcula el Dólar a $0.90 Euros";
                break;
            case "Dólar - MXN":
                result = val1 * 18.75;
                res = String.valueOf("$" + result + " Pesos Méxicanos");
                valorDivisa = "Se calcula el Dólar a $18.75 MXN";
                break;
            case "Euro - Dólar":
                result = val1 * 1.10;
                res = String.valueOf("$" + result + " Dólares");
                valorDivisa = "Se calcula el Euro a $1.10 Dólares";
                break;
            case "Euro - MXN":
                result = val1 * 20.81;
                res = String.valueOf("$" + result + " Pesos Méxicanos");
                valorDivisa = "Se calcula el Euro a $20.81 MXN";
                break;
        }
    }

}
