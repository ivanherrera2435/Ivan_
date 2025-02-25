public abstract class Cositas {
    abstract void hacerAlgo();
}

class Main {
    public static void main(String[] args) {
        // Cositas c = new Cositas(); // ❌ ERROR: No se puede instanciar una clase
        // abstracta
    }
}

////////////////////////////////////////////////////////////////////
abstract class cositas {
    void hacerAlgo() {
        System.out.println("Este método debe ser sobrescrito en una subclase.");
    }
}

class SubCositas extends Cositas {
    @Override
    void hacerAlgo() {
        System.out.println("Haciendo algo en SubCositas.");
    }
}

class main2 {
    public static void main(String[] args) {
        Cositas c = new SubCositas();
        c.hacerAlgo();
    }
}
