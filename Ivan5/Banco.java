public class Banco {
    private double saldo;

    
    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a cero.");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor a cero.");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    

}

 class H   {
    public static void main(String[] args) {
        Banco cuenta = new Banco(1000);
        cuenta.mostrarSaldo(); 

        
        cuenta.depositar(500);
        cuenta.mostrarSaldo();

        
        cuenta.retirar(200);
        cuenta.mostrarSaldo(); 

        
        cuenta.retirar(2000);
    }
    public void retirar(double cantidad) {
    

    }
}


