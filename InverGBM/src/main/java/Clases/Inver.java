/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author slcomputacion
 */
public class Inver {
        //private static final double interes = 0.875;
        private double interes = 0.875 ;
        private int meses = 12;
        private int dias = 30;
        private double cantidadInversion;
        

    public Inver() {
        
    }

    public double getInteres() {
        return interes;
    }

    public int getMeses() {
        return meses;
    }

    public int getDias() {
        return dias;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getCantidadInversion() {
        return cantidadInversion;
    }

    public void setCAntidadInversion(double antidadInversion) {
        this.cantidadInversion = antidadInversion;
    }
    
    //metodo
    public double cantidadAno(){
        //double cantidadInvertida;
            double cantidadAno = (cantidadInversion * interes) / 10;      
            return cantidadAno;
    }
    
    public double cantidadMes(){
    double cantidadMes = ((cantidadInversion * interes) / 10)/meses;
    return cantidadMes;
}
    public double cantidadDia(){
        double cantidaDia = ((cantidadInversion * interes) / 10/meses)/dias;
        return cantidaDia;
    }

    @Override
    public String toString() {
        return "Inversion de: {" + "Cantidad = $ " + cantidadInversion + ", Tasa de Interes = " + interes + '}' ;
    }

    

 
    
    
    
}
