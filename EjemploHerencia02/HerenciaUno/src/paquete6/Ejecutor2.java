/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos
        
        // Trabajo clases 16 junio 2022
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
    

        while(bandera){
        System.out.println("Ingresa el Estudiante: ");
        System.out.println("Ingrese los Nombre");
        String n = entrada.nextLine();
        System.out.println("Ingrese los Apellido");
        String a = entrada.nextLine();
        System.out.println("Ingrese la identificacion");
        String iden = entrada.nextLine();
        System.out.println("Ingrese la edad");
        String ed = entrada.nextLine();
        System.out.println("Ingrese el numero de Costo:");
        int creditos = entrada.nextInt();
        System.out.println("Costo de Credito:");
        double costo = entrada.nextDouble();
        entrada.nextLine(); 
        
            EstudiantePresencial estudiante = new EstudiantePresencial(n, a, iden, ed, creditos ,costo);
            estudiante.calcularMatriculaPresencial();
            cadena = String.format("%s%s\n", cadena, estudiante);
         
        
            System.out.println("Desea ingresar otro estudiante? (si/no)");
            String respuesta = entrada.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                bandera = false;
            }
        
        }
         System.out.println(cadena);
            
        
        }
    }   




