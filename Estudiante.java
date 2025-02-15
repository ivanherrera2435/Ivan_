public class Estudiante {
    String Nombre;
    int Edad;
    int Curso;

    public Estudiante(){
        this.Nombre="Nombre";
        this.Edad=0;
        this.Curso=1;

    }
    public Estudiante(String Nombre,int Edad){
        this.Nombre=Nombre;
        this.Edad=Edad;

    }
    public Estudiante(String Nombre,int Edad,int Curso){
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.Curso=Curso;

    }
}
