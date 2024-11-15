package figurasgeometricas;
import jerarquiaFiguras.*;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Cuadrado");
        Cuadrado c = new Cuadrado(20.5,"rojo");
        System.out.println("Cuadrado "+c.getColor()
                            +" con area de: "+c.calcularArea());
        
        System.out.println("Triangulo");
        TrianguloRectangulo t = new TrianguloRectangulo(10,5,"verde");
        System.out.println("Triangulo "+t.getColor()
                            +" con area de: "+t.calcularArea());

        System.out.println("ciruculo");
        Circulo circulo = new Circulo("azul",3);
        System.out.println("circulo " + circulo.getColor() + " con radio de: " +circulo.calcularArea());
    }
    
}
