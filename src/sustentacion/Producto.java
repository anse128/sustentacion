/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author sebastian
 */
public class Producto {
    Scanner lector = new Scanner(System.in);
    private String nombre="";
    private int cantidad=0, valor=0, venta=0, total=0;

    
    public void nombre_(String nombre) {
        this.nombre = nombre;
    }

    public void cantidad_(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void valor_(int valor) {
        this.valor = valor;
    }
       
    public void Datos(){
        System.out.println("Digite nombre del producto: ");
        nombre = lector.next();
        System.out.println("Digite la cantidad: ");
        cantidad = lector.nextInt();
        System.out.println("Digite el valor individual del producto: ");
        valor = lector.nextInt();
}
    
    public int Buscar(String a){
        int x=0;
        if (nombre.equals(a)){
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Valor: " + valor);
            x=1;
        }
        return x;
    }
    
    public String Get_nombre(){
        return nombre;
    }
    
    public int Eliminar(String a)
    {
        int x=0;
        if (nombre.equals(a)){
            nombre = "";
            cantidad = 0;
            valor = 0;
            x=1;
        }
        return x;
    }
    public void Inventario()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Valor: " + valor);
    }
    public void Venta(String a, int v)
    {
        if (nombre.equals(a)){
            venta=v;
 
        }
    }
    public void Ganancias()
    {
        total = venta*valor;
        System.out.println("Nombre: " + nombre);
        System.out.println("Valor total: " + total);
        System.out.println("");
    }
}
