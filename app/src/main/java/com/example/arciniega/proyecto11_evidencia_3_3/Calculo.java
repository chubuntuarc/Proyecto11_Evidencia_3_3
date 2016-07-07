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
                    result = val1 * 0.19;
                    res = String.valueOf(result + "Pesos Méxicanos");
                    valorDivisa = "Se calcula el Dólar a $19 MXN";
                break;
            case "MXN - Euro":
                    result = val1 * 0.20;
                    res = String.valueOf(result + "Euros");
                    valorDivisa = "Se calcula el Dólar a $20 MXN";
                break;
            case "Dólar - Euro":
                    result = val1 * 0.90;
                    res = String.valueOf(result + "Euros");
                    valorDivisa = "Se calcula el Euro a $0.90 Dólares";
                break;
            case "Dólar - MXN":
                result = val1 * 19;
                res = String.valueOf(result + "Pesos Méxicanos");
                valorDivisa = "Se calcula el Dólar a $19 MXN";
                break;
            case "Euro - Dólar":
                result = val1 * 19;
                res = String.valueOf(result + "Dólares");
                valorDivisa = "Se calcula el Euro a $19 Dólares";
                break;
            case "Euro - MXN":
                result = val1 * 20;
                res = String.valueOf(result + "Pesos Méxicanos");
                valorDivisa = "Se calcula el Euro a $20 MXN";
                break;
        }
    }

}
