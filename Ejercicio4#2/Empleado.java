public class Empleado {
    public String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void serSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("No puede ser negativo");
        }
    }
}

class prueba7 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 400000);
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario: " + empleado.getSalario());
    }

}
