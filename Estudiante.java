public class Estudiante {
    String nombre;
    int edad;

    public static void main(String[] args) {
        Estudiante Estudiante1 = new Estudiante();
        Estudiante1.mostrarDetalles();
    }

    public Estudiante(){
        this("Breiner", 19);
    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: "+ this.nombre + ", Edad:" + this.edad);
    }

}