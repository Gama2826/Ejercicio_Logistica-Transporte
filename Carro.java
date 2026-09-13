public class Carro {
    //Atributos
    private String conductor;
    private String vehiculo;
    private double kmR;
    private String hSalida;
    private String hLlegada;
    private int ruta;

    // Constructor
    public Carro(String conductor, String vehiculo, double kmR, String hSalida, String hLlegada, int ruta) {
        this.conductor = conductor;
        this.vehiculo = vehiculo;
        this.kmR = kmR;
        this.hSalida = hSalida;
        this.hLlegada = hLlegada;
        this.ruta = ruta;
    }

    // Getters y Setters
    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getKmR() {
        return kmR;
    }

    public void setKmR(double kmR) {
        this.kmR = kmR;
    }

    public String getHSalida() {
        return hSalida;
    }

    public void setHSalida(String hSalida) {
        this.hSalida = hSalida;
    }

    public String getHLlegada() {
        return hLlegada;
    }

    public void setHLlegada(String hLlegada) {
        this.hLlegada = hLlegada;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Vehículo Número: " + vehiculo + 
               "\n Conductor: " + conductor + 
               "\n Km Recorridos: " + kmR + "km" + 
               "\n Salida: " + hSalida + 
               "\n Llegada: " + hLlegada + 
               "\n Ruta: " + ruta + "\n";
    }
}