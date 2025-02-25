public abstract class Figura{
    public abstract double CalcularArea();
}

public class Rectangulo extends Figura{
    public double rango;
    public double ancho;

    public Rectangulo(double rango,double ancho){
     this.ancho = ancho;
     this.rango = rango;
    }

    @Override
    public double CalcularArea(){
        return rango *ancho;
    }

    
}
public class Triangulo extends Figura{
    public double base;
    public double altura;

    public Triangulo(double base,double altura){
        this.altura =altura;
        this.base = base;
    }
    @Override
    public double CalcularArea(){
        return (base*altura) /2;
    }
}
public class prueba {
    public static void main(String[] args) {
        Rectangulo rect =  new Rectangulo(5.0 ,3.0);
        System.out.println("Area del rectangulo"+rect.CalcularArea());

        Triangulo tri = new Triangulo(4.0, 6.0);
        System.out.println("Area del triangulo"+tri.CalcularArea());
    }
}
    