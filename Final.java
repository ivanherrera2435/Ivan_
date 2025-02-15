import java.util.Scanner;

public class Final {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro");
        String Libro =scanner.nextLine();
        System.out.println("Ingrese numero de paginas del libro");
        int numeroPaginas= scanner.nextInt();
        scanner.nextLine();

        Libro libro = new Libro(titulo, Libro,numeroPaginas);
        System.out.println("Detalles del libro: " + libro+titulo);


        System.out.println("Ingrese el numero de cuenta");
        int NumeroCuenta=scanner.nextInt();
        System.out.println("Ingrese el saldo de la cuenta");
        int Saldo=scanner.nextInt();
        System.out.println("Ingrese el tipo de cuenta");
        String TipoCuenta=scanner.nextLine();

        CuentaBancaria cuentaBancaria = new CuentaBancaria(NumeroCuenta,Saldo,TipoCuenta);
        System.out.println("Detalles de la cuentaBancaria"+cuentaBancaria+NumeroCuenta);

        System.out.println("Ingrese el nombre del estudiante ");
        String Nombre=scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        int Edad=scanner.nextInt();
        System.out.println("Ingrese el curso del estudiante");
        int Curso=scanner.nextInt();

        Estudiante estudiante = new Estudiante(Nombre,Edad,Curso);
        System.out.println("Destalles del estudiante"+estudiante);

       scanner.close();

    }
}