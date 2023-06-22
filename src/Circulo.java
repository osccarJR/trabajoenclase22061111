public class Circulo extends Figura {
    double radio;

    @Override
    public double calcularPerimetro() {
        radio = calcularDistancia(0, 1);
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        radio = calcularDistancia(0, 1);
        return Math.PI * Math.pow(radio, 2);
    }
}

