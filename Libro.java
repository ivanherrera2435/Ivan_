public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    public  Libro(){
        titulo = "Desconocido";
        autor = "Sin autor";
        numeroPaginas=0;
       

    }
    public Libro(String titulo,String autor,int numeroPaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }
    public void MostrarDetalles(){
        System.out.println("titulo :" + titulo);
        System.out.println("autor :"+ autor);
        System.out.println("numeroPaginas :"+ numeroPaginas);
    }
    public static void main(String[] args) {
        Libro libro1= new Libro();
        libro1.MostrarDetalles();
    }

    
    
}