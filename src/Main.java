import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe lo  que deseas calcular: \n1 -> Triangulo \n2 -> Cuadrado \n3 -> Circulo");
        int figura = sc.nextInt();

        Figura f = null;
        switch(figura) {
            case 1:
                f = new Triangulo();
                for (int i = 0; i < 3; i++) {
                    System.out.println("Escribe los puntos para triangulo " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            case 2:
                f = new Cuadrado();
                for (int i = 0; i < 2; i++) {
                    System.out.println("Escribe los puntos para cuadrado " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            case 3:
                f = new Circulo();
                for (int i = 0; i < 2; i++) {
                    System.out.println("Escribe los puntos para circulo " + (i+1) + ": ");
                    f.ingresarPuntos();
                }
                break;
            default:
                System.out.println("Escribe: 1 para Triangulo, 2 para Cuadrado o 3 para Circulo.");
                break;
        }

        if (f != null) {
            System.out.println("Que quieres calcular el Area o el Perimetro? \n1 -> Area \n2 -> Perimetro");
            int opcion = sc.nextInt();
            if(opcion == 1) {
                System.out.println("Area de la figura: " + f.calcularArea());
            } else if(opcion == 2) {
                System.out.println("Perimetro de la figura: " + f.calcularPerimetro());
            } else {
                System.out.println("No se puede. Escribe 1 para Area o 2 para Perimetro.");
            }
        }
    }
}
