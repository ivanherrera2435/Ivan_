public class Ejercicio3 {
    class Vehiculo {
        
        public void moverse(int velocidad) {
            System.out.println("El vehículo se mueve a " + velocidad + " km/h.");
        }
    }
    
    class Bicicleta extends Vehiculo {
        
        public void moverse() { 
            System.out.println("La bicicleta se está moviendo pedaleando.");
        }
    }
    

    public class Main {
        public static void main(String[] args) {
          Ejercicio3 bicicleta = new Ejercicio3();
            
        }
}

}
