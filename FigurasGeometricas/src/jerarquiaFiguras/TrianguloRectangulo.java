package jerarquiaFiguras;

public class TrianguloRectangulo extends Figura{
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    @Override
    public double calcularArea(){
        System.out.println("esto es un triangulo");
        return (base * altura) / 2;

    } 
}
