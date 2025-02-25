public class Vehiculo {
    String marca;
    int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + "Velocidad Maxima: " + velocidadMaxima);
    }
}

class Coche extends Vehiculo {
    int numeroPuertas;

    public Coche(String marca, int velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}

