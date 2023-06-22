public class Cuadrado extends Figura {
    double lado;

    @Override
    public double calcularPerimetro() {
        lado = calcularDistancia(0, 1);
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        lado = calcularDistancia(0, 1);
        return Math.pow(lado, 2);
    }
}