/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;
import java.util.Scanner;
/**
 *
 * @author Karol Ayestas
 */
public class CalculadoraSalario {
@SuppressWarnings("empty-statement")
public static void main(String args[]) {
        System.out.println(" C A L C U L O  D E  S A L A R I O***");
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese nombre Empleado: ");
        String nombreEmpleado = leer.nextLine();
        
        System.out.print("Ingrese el Rol de Trabajo: ");
        String nombreRol = leer.nextLine();
       
        System.out.print("Ingrese horas tabajadas por Semana: ");
        int horasTrabajo = leer.nextInt();

                
        double salario = 0;
        
        double bono = 0;
        
        double seguro = 0;
        
        float rol = 0;
        
        while(rol == 0)
        {
    if (nombreRol.equals("administrador"))
        rol = 1;
    {
         if(horasTrabajo >= 0 && horasTrabajo <= 40)
                salario = 5 * horasTrabajo;
        
         else if (horasTrabajo > 40 && horasTrabajo <= 60) 
            salario = 6.5 * horasTrabajo;
         else if (horasTrabajo >= 61) 
            salario = 8 * horasTrabajo;
    }
    
        if(nombreRol.equals("programador"))
            rol = 2;
        {
        { if(horasTrabajo >= 0 && horasTrabajo <= 40)
               salario = 5 * horasTrabajo;
        
         else if (horasTrabajo > 40 && horasTrabajo <= 60) 
         {  salario = 6 * horasTrabajo;
            bono=50;
         }
         else if (horasTrabajo >= 61) 
         {  salario = 7 * horasTrabajo;
            bono=50;
         }
        }
        }
        
        if(nombreRol.equals("diseñador"))
            rol = 3;
        {
        { if(horasTrabajo >= 0 && horasTrabajo <= 40)
               salario = 4 * horasTrabajo;
         else if(horasTrabajo >= 41)
                 salario = 5.5f * horasTrabajo;
        }
        }
        else 
        {
            System.out.print("Rol no existente. Intente de nuevo");
        }
        }

     
        
         
        System.out.println("Salario:."+salario);
        seguro = (salario + bono)*(5f/100);
        System.out.println("Seguro:"+seguro );
        
        System.out.println("Salario neto: "+(salario-seguro));
}
}