package Vestuario;

public enum Vestuario {

        BLUSA("Blusa", "Tela de Algodon", 1),
        JEAN("Jean", "Tela denim", 2),
        CAMISETA("Camiseta", "Tela de Lino", 3),
        CAMISA("Camisa", "Tela saten", 4);

        private final String nombre;
        private final String descripcion;
        private final int numeroEstante;


        Vestuario(String nombre, String descripcion, int numeroEstante) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.numeroEstante = numeroEstante;
        }


        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getNumeroEstante() {
            return numeroEstante;
        }

        public void mostrarDescripcionPrenda() {
            System.out.println("La " + nombre + " es una prenda de vestir hecha de " + descripcion + ".");
        }
    }
