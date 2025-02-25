import java.lang.Math;

public abstract class Figura {

    abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El area de la figura es: " + calcularArea());
    }

}

class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

}

class Rectangulo extends Figura {
    double alto;
    double ancho;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    double calcularArea() {
        return ancho * alto;
    }
}

class Mostrar {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(60);
        Rectangulo r1 = new Rectangulo(30, 20);
        c1.mostrarArea();
        r1.mostrarArea();
    }
}
