/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package slcomputacion.invergbm;

import Clases.Inver;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author slcomputacion
 */
public class InverGBM {

    public static void main(String[] args) {
        Inver in = new Inver();
        //Scanner leer = new Scanner(System.in);
        
        //double cantidad;
        
        double cantidad = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a Invertir "));
        in.setCAntidadInversion(cantidad);
        
        //in.toString();
        System.out.println("=================================================================");
        System.out.println(in.toString());
        //System.out.println("Cantidad Anual: %2.4f"+in.cantidadAno());
        System.out.printf ("Anual = %6.4f, Mensual = %6.4f, Diario = %6.4f %n", in.cantidadAno(), in.cantidadMes(),in.cantidadDia());
        System.out.println("=================================================================");
            
        
    }
}
