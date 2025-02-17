public class Producto {
    String nombre;
    int precio;

    public static void main(String[] args) {
        Producto Producto1 = new Producto(null, 0);
        Producto1.mostrarDetalles();
    }

    public Producto (String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setDetalles(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Precio: "+ this.precio);
    }

}
