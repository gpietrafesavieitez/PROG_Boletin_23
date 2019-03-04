/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package boletin_23_1;

import java.util.ArrayList;

public class Programa {
    
    public static double venderEntradas(int n) throws fueraDeRangoExcepcion{
        double total = 0;
        if(n < 0 || n > 50){ // Si n de personas en cola esta fuera de rango
            throw new fueraDeRangoExcepcion(); // Lanzo excepcion (la trato en el main)
        }else{
            // Creo array personas de tamaño igual al rango anteriormente proporcionado y generos edades aleatoriamente
            ArrayList<Integer> listaPersonas = new ArrayList<>(); 
            for(int i = 0; i < n; i ++){
                listaPersonas.add((int) ((Math.random() * 56) + 5));
            }
            // Debug para ver el array creado:
            // System.out.print(listaPersonas.toString());
            for(int i : listaPersonas){ // Recorro el array
                if(i <= 10){ // Entre 5* y 10 
                    total += 1; 
                }else if(i < 18){ // Entre 11 y 17
                    total += 2.5;
                }else{ // Entre 18 y 60*
                    total += 3.5;
                }
            }
            return total; 
        }
    }
}