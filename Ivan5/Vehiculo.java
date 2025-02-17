public class Vehiculo {
    protected String tipo;
    protected String marca;

    // Constructor de la clase Vehículo
    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    // Métodos de la clase Vehículo
    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
}


class Moto extends Vehiculo {
    
    private int cilindrada;

    
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca); 
        this.cilindrada = cilindrada;
    }

    
    public void mostrarInfoMoto() {
        mostrarInfo(); 
        System.out.println("Cilindrada: " + cilindrada);
    }
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
}
