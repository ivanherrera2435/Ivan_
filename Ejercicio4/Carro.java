public class Carro {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Carro(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    /*
     * public double getVelocidadMaxima(){
     * return velocidadMax

    public void Acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        }
    }
}

class prueba6 {
    public static void main(String[] args) {
        Carro coche1 = new Carro("Toyota", "Corolla", 180);

        // coche1.marca = "Honda";
        // coche1.modelo = "Civic";
        // coche1.velocidadMaxima = 200;

        // Intento de acelerar correctamente
        coche1.Acelerar(20);
    }
}
