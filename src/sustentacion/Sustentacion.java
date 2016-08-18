/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author sebastian escobar osorio
 * C.C. 1017231742
 */
public class Sustentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        String a;
        int i=0,b;
        Scanner lector = new Scanner(System.in);
        
        Producto arrayObjetos[]=new Producto[10];
        
        for (int j = 0; j < 10; j++) {         
            arrayObjetos[j]= new Producto();
        }          

        do{
            System.out.println("Elija una opción");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Realizar venta");
            System.out.println("6. Mostrar Ganancias totales");
            System.out.println("7. Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 1: arrayObjetos[i].Datos();
                    i++;
                    break;
                case 2: System.out.println("ingrese el nombre del producto");
                    int x=0;    
                    a = lector.next();
                    for (int j=0;j<i;j++) {
                        x=arrayObjetos[j].Buscar(a);
                    }
                    if (x==0)
                        System.out.println("El producto no existe");
                    break;
                case 3:System.out.println("Ingrese el nombre del producto que desea eliminar");
                    int z=0;
                    a = lector.next();
                    for (int j=0;j<i;j++)
                        z=arrayObjetos[j].Eliminar(a);
                    if (z==0)
                        System.out.println("El producto no existe");
                    break;
                case 4: 
                    for (int j = 0; j < i; j++) {
                        arrayObjetos[j].Inventario();
                    }
                    break;
                case 5: System.out.println("ingrese el nombre del producto\n");
                        a = lector.next();
                        System.out.println("ingrese el numero de ventas\n");
                        b = lector.nextInt();
                    for (int j = 0; j < i; j++) {
                        arrayObjetos[j].Venta(a,b);
                    }
                    break;
                case 6: 
                    for (int j = 0; j < i; j++) {
                        arrayObjetos[j].Ganancias();
                    }
                    break;
                case 7: System.out.println("Adios");
                    break;    
                default: System.out.println("Opción invalida");
            }
        }while(opcion!=0);
        
    }
}
