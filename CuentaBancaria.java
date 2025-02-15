public class CuentaBancaria {
    int NumeroCuenta;
    int Saldo;
    String TipoCuenta;

    public CuentaBancaria(){
        NumeroCuenta = 23232;
        Saldo =0;
        TipoCuenta="Desconocido";

    }
    public CuentaBancaria(int NumeroCuenta,String TipoCuenta){
        this.NumeroCuenta=NumeroCuenta;
        this.TipoCuenta=TipoCuenta;

    }
    public CuentaBancaria(int NumeroCuenta,int Saldo,String TipoCuenta){
        this.NumeroCuenta=NumeroCuenta;
        this.Saldo=Saldo;
        this.TipoCuenta=TipoCuenta;
    }
    
    
    
    

    

    
}
