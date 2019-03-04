/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package boletin_23_1;

import javax.swing.JOptionPane;
import utilidades.PedirDatos;

public class Boletin_23_1 {
    
    public static void main(String[] args) {
        try{
            JOptionPane.showMessageDialog(null,"Recaudado: " + Programa.venderEntradas(Integer.parseInt(PedirDatos.tipoString(true,"Número de personas en la cola: "))) + "€","Programa",1);
        }catch(fueraDeRangoExcepcion e1){ // Trato excepcion personalizada
            JOptionPane.showMessageDialog(null,"El valor introducido está fuera del rango permitido.","Error",0);
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null,"Formato incorrecto.","Error",0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"¡Ups! lo sentimos, ha ocurrido un error inesperado.","Error",0);
        }
    }
}
