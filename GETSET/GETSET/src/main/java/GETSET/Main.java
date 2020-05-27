/*
ZAVALA CONCHA SILVIA NALLELY
 */
package GETSET;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
      
       
        
            int opc,num;
        System.out.println("Bienvenido ");
        
        System.out.println("Numero de Empleados ");
        num=sc.nextInt();
        String [] nombre = new String[num];
        String [] apellido = new String[num];
        int [] edad = new int[num];
        for (int i=1; i<=num; i++){
     System.out.println("Que datos desea ingresar"
                + "\n1. Nombre, apellido y edad"
                + "\n2. Nombre y edad"
                + "\n3. Nombre y Apellido");
        opc= sc.nextInt();
            switch(opc){
            case 1:
                sc.nextLine();
          System.out.println(" Nombre del empleado "+i+ ":");
          nombre[i] = sc.nextLine();
          
          System.out.println("Apellido del empleado " +i+":");
          apellido[i] = sc.nextLine();
         
          System.out.println("Edad del empleado "+i+":");
          edad[i] = sc.nextInt();
         Empleado a = new Empleado (nombre[i], apellido[i], edad[i]);
         a.datos1();
            break;
      
            case 2: 
        sc.nextLine();
         System.out.println(" Nombre del empleado "+i+ ":");
          nombre[i] = sc.nextLine();
          
          System.out.println("Edad del empleado "+i+":");
          edad[i] = sc.nextInt();
         Empleado b = new Empleado (nombre[i], edad[i]);
         b.datos2();
            break;
           
            case 3:
                sc.nextLine();
          System.out.println("Nombre del empleado "+i+ ":");
          nombre[i] = sc.nextLine();
          
          System.out.println("Apellido del empleado " +i+":");
          apellido[i] = sc.nextLine();
          Empleado d = new Empleado (nombre[i], apellido[i]);
         d.datos3();
          break;
         
            default:
                System.out.println("Error  seleccione del menu que se le brinda ");
                  break;
        }
         
           
        }
    }
}
    
    

