/*
 ZAVALA CONCHA SILVIA NALLELY
 */
package GETSET;

/**
 *
 * @author Hogar
 */
class Empleado {
    public String nombre;
    public String apellido;
    public int edad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public Empleado(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
       
    public void datos1(){
        
        System.out.println("Hola "+nombre+" "+apellido+ " tienes "+edad+" a�os.");
    }
      public void datos2(){
        
        System.out.println("Hola "+apellido+ " tienes "+edad+" a�os.");
    }
   
          public void datos3(){
        
        System.out.println("Hola "+nombre+" "+apellido+ "");
    }
}

