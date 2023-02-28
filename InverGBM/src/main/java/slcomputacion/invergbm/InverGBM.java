/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package slcomputacion.invergbm;

import Clases.Inver;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

/**
 *
 * @author slcomputacion, Salvador Lopez Baltazar
 */
public class InverGBM {

    public static void main(String[] args) {
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        Inver in = new Inver();
        
        boolean repetir = true;
        while (repetir) {
            try {
                
                double cantidad = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a Invertir "));
                in.setCAntidadInversion(cantidad);//caso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la manera quiere imprimir la bienvenida(1-scanner,2-Panel)"));
                
                JOptionPane.showMessageDialog(null, "Anual:      " + formatoImporte.format(in.cantidadAno()) + "\nMensual: " +formatoImporte.format (in.cantidadMes())+ "\nDiario:      "+ formatoImporte.format(in.cantidadDia()),"Inversion", JOptionPane.NO_OPTION);
                repetir = false;
                
                System.gc();
                System.exit(0); //Salir del Programa
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Cadena ingresada, debe ingresar un valor numerico", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                //caso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la manera quiere imprimir la bienvenida(1-scanner,2-Panel)"));
            }

        }
        
    }
}
