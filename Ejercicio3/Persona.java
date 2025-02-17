public class Persona {
    private String Nombre;
    int edad;

Persona(String Nombre,int edad){
    this.Nombre=Nombre;
    this.edad=edad;
}
public String getNombre(){
    return Nombre;
}
public String setNombre(){
    return Nombre;
}

public void setNombre(String nombre) {
    this.Nombre = nombre;
}
public class Prueba{
    public static void main(String[] args) {
        Persona persona = new Persona("iVAN", 19);
        System.out.println("Nombre :"+ persona.getNombre());

       persona.setNombre("Marlys");


       System.out.println("Nombre modificado"+persona.getNombre());

       System.out.println("Edad :"+persona.edad);
    }
}
public static void main(String[] args) {
    Persona persona = new Persona("iVAN", 19);
    System.out.println("Nombre :"+ persona.getNombre());

   persona.setNombre("Marlys");


   System.out.println("Nombre modificado :"+persona.getNombre());

   System.out.println("Edad :"+persona.edad);
}

}
