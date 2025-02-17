public class Persona {
    String nombre;
    int edad;
    
    public Persona(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }
 
 
 public void presentarse() {
     System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
 }
 
 
 
 class Estudiante extends Persona {
 String carrera;
 
 
 public Estudiante(String nombre, int edad, String carrera) {
     super(nombre, edad);
     this.carrera = carrera;
 }
 
 
 @Override
 public void presentarse() {
     System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y estudio " + carrera + ".");
 }
 }
 public class Main {
 }
     public static void main(String[] args) {
         
         Persona persona = new Persona("Juan", 30);
        


     }
 
 
 class Profesor extends Persona {
 String materia;
 
 
 public Profesor(String nombre, int edad, String materia) {
     super(nombre, edad);
     this.materia = materia;
 }
 
 
 @Override
 public void presentarse() {
     System.out.println("Hola, soy el Profesor " + nombre + ", tengo " + edad + " años y enseño " + materia + ".");
 }
 }
 

    
} 
  