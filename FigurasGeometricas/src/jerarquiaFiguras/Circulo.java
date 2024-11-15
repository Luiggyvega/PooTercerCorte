package jerarquiaFiguras;

public class Circulo extends Figura {
    private int radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        System.out.println("esto es un circulo");
        return Math.PI*Math.pow(radio,2);
    }
}
