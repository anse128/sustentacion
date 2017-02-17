import javax.swing.JOptionPane;
public class EmpleadoApp {
 
    public static void main(String[] args) {
 
        //Creamos un array de objetos de la clase empleados
        Empleado arrayObjetos[]=new Empleado[10];
 
        //Creamos 10 empleados por defecto
        int suma=0;
        for (int i=0;i<arrayObjetos.length;i++){
            //Indicamos cada uno de los parametros del objeto
            String nombre=JOptionPane.showInputDialog("Escribe un nombre");
 
            String apellido=JOptionPane.showInputDialog("Escribe un apellido");
 
            String texto=JOptionPane.showInputDialog("Escribe una edad");
            int edad=Integer.parseInt(texto);
 
            texto=JOptionPane.showInputDialog("Escribe un salario");
            double salario=Double.parseDouble(texto);
 
            arrayObjetos[i]=new Empleado(nombre, apellido, edad, salario);
        }
 
        //Lo recorremos y sumamos de nuevo los salarios
        for (int i=0;i<arrayObjetos.length;i++){
            //Mostramos la direccion del objeto
            System.out.println(arrayObjetos[i]);
            suma+=arrayObjetos[i].getSalario();
        }
        System.out.println("La suma de salarios es "+suma);
    }
 
}
