public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

class PruebaAcceso {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos");

    }
}


class Producto {
    private double precio;


    public Producto(double precio) {
        this.precio = precio;
    }
}
