package Transporte;

public class TransporteMain {

        public static void main(String[] args) {

            for (Transporte transporte : Transporte.values()) {
                System.out.println("Tipo de transporte: " + transporte);
                System.out.println("Capacidad: " + transporte.getCapacidad() + " pasajeros");
                System.out.println("Tipo de motor: " + transporte.getTipoMotor());
                transporte.mostrarDescripcion();
                System.out.println();
            }
        }
    }
