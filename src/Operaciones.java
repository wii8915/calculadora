
import java.util.Scanner;

public class Operaciones {
    private double a;
    private double b;

    public Operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double suma() {
        return a + b;
    }

    public double resta() {
        return a - b;
    }

    public double multiplicacion() {
        return a * b;
    }

    public double division() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }
    public double potenciacion() {
        return Math.pow(a, b);
    }
    public double raiz() {
        return Math.sqrt(a); // Calcula la raíz cuadrada de 'a'
    }

    
    public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Operaciones operacion = new Operaciones(0, 0);

            while (true) {
                System.out.print("Introduce el primer número (a): ");
                double a = scanner.nextDouble();
                operacion.setA(a);

                System.out.print("Introduce el segundo número (b): ");
                double b = scanner.nextDouble();
                operacion.setB(b);

                System.out.println("Elige una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Potenciación");
                System.out.println("6. Raíz cuadrada de a");
                System.out.println("7. Salir");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + operacion.suma());
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + operacion.resta());
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + operacion.multiplicacion());
                        break;
                    case 4:
                        System.out.println("Resultado de la división: " + operacion.division());
                        break;
                    case 5:
                        System.out.println("Resultado de la potenciación: " + operacion.potenciacion());
                        break;
                    case 6:
                        System.out.println("Raíz cuadrada de 'a': " + operacion.raiz());
                        break;
                    case 7:
                        System.out.println("Saliendo del programa.");
                        scanner.close();
                        System.exit(0);


                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            }
        }
    }

    
}

