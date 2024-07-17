import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automovil automovil = null;
        CalculadorDeImpuestos calculador = null;
        int opcion;

        do {
            System.out.println("===== Calculador de Impuestos Vehiculares =====");
            System.out.println("1. Ingresar datos del automóvil");
            System.out.println("2. Calcular impuestos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del automóvil: ");
                    double valorAutomovil = scanner.nextDouble();
                    System.out.print("Ingrese el tipo de servicio (privado/publico): ");
                    String tipoServicio = scanner.next();
                    automovil = new Automovil(valorAutomovil, tipoServicio);
                    calculador = new CalculadorDeImpuestos(automovil);
                    System.out.println("Datos del automóvil ingresados correctamente.");
                    break;
                case 2:
                    if (automovil == null) {
                        System.out.println("Por favor, ingrese primero los datos del automóvil.");
                    } else {
                        double totalImpuestos = calculador.calcularImpuesto();
                        System.out.println("Total de Impuestos: " + totalImpuestos);
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}