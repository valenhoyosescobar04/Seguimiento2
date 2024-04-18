package Transporte;

public enum Transporte {

        BUS(50, "Diesel"),
        TREN(200, "Eléctrico"),
        BARCO(150, "Combustible"),
        MOTO(2, "Gasolina"),
        AVION(300, "Jet");

        private final int capacidad;
        private final String tipoMotor;


        Transporte(int capacidad, String tipoMotor) {
            this.capacidad = capacidad;
            this.tipoMotor = tipoMotor;
        }


        public int getCapacidad() {
            return capacidad;
        }


        public String getTipoMotor() {
            return tipoMotor;
        }


        public void mostrarDescripcion() {
            System.out.println("Este medio de transporte tiene una capacidad de " + capacidad + " pasajeros y utiliza un motor de tipo " + tipoMotor + ".");
        }
    }

