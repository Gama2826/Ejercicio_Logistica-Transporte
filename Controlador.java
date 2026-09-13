import java.util.ArrayList;

public class Controlador {
    private ArrayList<Carro> listaCarros;
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.listaCarros = new ArrayList<>();
    }

    public void iniciarPrograma() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    mostrarVehiculos();
                    break;
                case 3:
                    eliminarVehiculo();
                    break;
                case 4:
                    vista.mostrarMensaje("Saliendo");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private void registrarVehiculo() {
        vista.mostrarMensaje("\n--- REGISTRO DE NUEVO VEHÍCULO ---");
        String numeroVehiculo = vista.solicitarVehiculo();

        if (buscarCarroPorNumero(numeroVehiculo) != null) {
            vista.mostrarMensaje("Error: Ya existe un vehículo registrado con el número " + numeroVehiculo);
            return;
        }

        String conductor = vista.solicitarConductor();
        double kmR = vista.solicitarKmR();
        String hSalida = vista.solicitarHSalida();
        String hLlegada = vista.solicitarHLlegada();
        int ruta = vista.solicitarRuta();

        Carro nuevoCarro = new Carro(conductor, numeroVehiculo, kmR, hSalida, hLlegada, ruta);
        listaCarros.add(nuevoCarro);
        vista.mostrarMensaje("Vehículo registrado");
    }

    private void mostrarVehiculos() {
        vista.mostrarMensaje("\n--- LISTA DE VEHÍCULOS REGISTRADOS ---");
        if (listaCarros.isEmpty()) {
            vista.mostrarMensaje("No hay vehículos registrados");
        } else {
            for (Carro carro : listaCarros) {
                vista.mostrarMensaje(carro.toString());
            }
        }
    }

    private void eliminarVehiculo() {
        vista.mostrarMensaje("\n--- ELIMINAR VEHÍCULO ---");
        if (listaCarros.isEmpty()) {
            vista.mostrarMensaje("No hay vehículos registrados para eliminar.");
            return;
        }

        String numeroVehiculo = vista.solicitarVehiculoAEliminar();
        Carro carroEncontrado = buscarCarroPorNumero(numeroVehiculo);

        if (carroEncontrado != null) {
            listaCarros.remove(carroEncontrado);
            vista.mostrarMensaje("El vehículo con número " + numeroVehiculo + " ha sido eliminado");
        } else {
            vista.mostrarMensaje("No se encontró ningún vehículo registrado con el número: " + numeroVehiculo);
        }
    }

    private Carro buscarCarroPorNumero(String numeroVehiculo) {
        for (Carro carro : listaCarros) {
            if (carro.getVehiculo().equalsIgnoreCase(numeroVehiculo)) {
                return carro;
            }
        }
        return null;
    }
}