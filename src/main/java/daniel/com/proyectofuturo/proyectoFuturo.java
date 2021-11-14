/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniel.com.proyectofuturo;

/**
 *
 * @author Daniel Jaen <DJaen98@gmail.com>
 */
public class proyectoFuturo {

    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : ");
        System.out.println(veredicto("23", "23"));
    }

    private static String veredicto(String valor1, String valor2) {
        System.out.println("Paramaetros pasados: p1(" + valor1 + ") y p2 (" + valor2 + ")");
        
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }

}
