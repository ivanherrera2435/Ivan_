
public interface Volador {
    void nadar();
        
    }
    public interface Nadador {
    void respirar();
        
    }
    public class Pato implements Nadador,Volador{
        @Override
        public void nadar(){
            System.out.println("El usuario quiere nadar");
    
        }
        public void volar(){
            System.out.println("El usuario quiere volar");
        }
        
    }
    public class prueba2 {
    
        public static void main(String[] args) {
            Pato L = new Pato();
            L.nadar();
            L.respirar();
        }
    }
    
