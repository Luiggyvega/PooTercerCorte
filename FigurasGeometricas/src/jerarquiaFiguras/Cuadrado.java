package jerarquiaFiguras;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    @Override
    public double calcularArea(){
        System.out.println("esto es un cuadrado");
        return lado * lado;
    }
}
