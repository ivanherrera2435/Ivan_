public class Persona1 {
    String nombre;
    int edad;

    public Persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }

    public void mostrarDetalles() {
        mostrar();
    }
}

class Estudiante extends Persona1 {
    String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Matricula: " + matricula);
    }
}

class Todo {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Pepe", 19, "12345");
        e1.mostrarDetalles();
    }
}
