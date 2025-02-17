
// Clase de prueba
public class Prueba {
    public static void main(String[] args) {
        // Crear un objeto de la clase Moto
        Moto miMoto = new Moto("Deportiva", "Yamaha", 600);
        miMoto.mostrarInfoMoto(); // Mostrar la información de la moto
        
        // Intentar acceder a los miembros protected desde una clase no relacionada (esto debería generar un error)
        // Esto generará un error de compilación
        // System.out.println(miMoto.tipo); // Error: tipo tiene acceso protected
    }
}