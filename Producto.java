public class Producto {
   String Nombre;
   double  Precio;
   int stock;

   Producto(String Nombre,double Precio,int stock){
    this.Nombre=Nombre;
    this.Precio=Precio;

   }
   void MoostrarInfo(){
    
   }
   public static void main(String[] args) {
    Producto producto = new Producto("Ivan",2000,15);
     System.out.println("Nombre :"+producto.Nombre);
     System.out.println("Precio :"+producto.Precio);
     System.out.println("stock :"+producto.stock);

     producto.MoostrarInfo();


   }

   


    
}