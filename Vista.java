import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- SISTEMA DE LOGÍSTICA DE TRANSPORTE ---");
        System.out.println("1. Registrar vehículo");
        System.out.println("2. Ver vehículos registrados");
        System.out.println("3. Eliminar vehículo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public String solicitarConductor() {
        scanner.nextLine();
        System.out.print("Ingrese el nombre del conductor: ");
        return scanner.nextLine();
    }

    public String solicitarVehiculo() {
        System.out.print("Ingrese el número del vehículo: ");
        return scanner.nextLine();
    }

    public double solicitarKmR() {
        System.out.print("Ingrese los kilómetros recorridos (kmR): ");
        double km = scanner.nextDouble();
        scanner.nextLine();
        return km;
    }

    public String solicitarHSalida() {
        System.out.print("Ingrese la hora de salida (ej. 06:00): ");
        return scanner.nextLine();
    }

    public String solicitarHLlegada() {
        System.out.print("Ingrese la hora de llegada (ej. 14:30): ");
        return scanner.nextLine();
    }

    public int solicitarRuta() {
        System.out.print("Ingrese el número de ruta: ");
        int r = scanner.nextInt();
        scanner.nextLine();
        return r;
    }

    public String solicitarVehiculoAEliminar() {
        scanner.nextLine();
        System.out.print("Ingrese el número del vehículo que desea eliminar: ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}