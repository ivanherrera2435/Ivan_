public class Vehiculo {
    public void Moverse(){
        System.out.println("El vehiculo se esta moviendo");


    }
class Bicicleta extends Vehiculo{
    @Override
    public void Moverse() {
        System.out.println("La bicicleta se está moviendo pedaleando.");
    }
}
public class bicicleta{

     
     
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        


        vehiculo.Moverse();
        
        
        
        
            }
        
            
            
}
}




