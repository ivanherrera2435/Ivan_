public class Empleado {
    public Empleado(String Nombre,double salario){
        this.Nombre=Nombre;
        this.salario=salario;
    
    
    }

    public class Main {
        public static void main(String[] args) {
            
            Empleado empleado = new Empleado("Ivan Herrera", 6500.00);
            
            
            empleado.mostrarInformacion();
        }

}
    class Gerente extends Empleado {
        // Propiedad adicional para Gerente
        protected String departamento;
    
        // Constructor
        public Gerente(String nombre, double salario, String departamento) {
            super(nombre, salario);  // Llamada al constructor de la clase base Empleado
            this.departamento = departamento;
        }
    
        // Sobrescribir el método mostrarInformacion
        @Override
        public void mostrarInformacion() {
            // Mostrar la información del empleado
            super.mostrarInformacion();  // Llama al método mostrarInformacion de la clase base
            // Mostrar la información adicional de Gerente
            System.out.println("Departamento: " + departamento);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Crear una instancia de Gerente
        final Empleado gerente = new Empleado("Ivan", 5500.00);
        final Empleado  Gerente = new Empleado("Ivan", 5500.00);
        // Mostrar la información del gerente
        gerente.mostrarInformacion(); // Esto imprimirá la información completa del gerente
    }
    protected String Nombre;
    protected double salario;



// Clase de prueba

    public void mostrarInformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Salario: " + salario);
    }
}





