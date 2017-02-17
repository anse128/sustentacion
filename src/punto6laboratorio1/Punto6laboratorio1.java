/*
En la U de A hay una máquina dispensadora que tiene 4 productos etiquetados con
los números 1, 2, 3 y 4, cada uno con un valor de $500, $800, $300 y $900, 
respectivamente. Defina un algoritmo que lea el número de producto que ingresa
el usuario y que le muestre su precio.
 */
package punto6laboratorio1;

import java.util.Scanner;

/**
 *
 * @author sebastian
 */
public class Punto6laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner lector = new Scanner (System.in);    
        
    System.out.println("¡BIENBENIDO!\n"
            + "Digite el numero que le corresponde a cada producto:\n"
            + "1: Chocolate\n"
            + "2: Masmelos\n"
            + "3: Arequipe\n"
            + "4: Ponké");
    
    int producto = lector.nextInt();
    
    System.out.println("El valor del procudoto es: ");

    switch (producto) {
 
        case 1:
        System.out.println("500");
        break;
 
        case 2:
        System.out.println("800");
        break;
        
        case 3:
        System.out.println("300");
        break;
        
        case 4:
        System.out.println("900");
        break;
        
        default:
        System.out.println("El valor indicado no es valido");
        break;
 
 }}
    
}
