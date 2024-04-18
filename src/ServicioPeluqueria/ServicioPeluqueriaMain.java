package ServicioPeluqueria;

public class ServicioPeluqueriaMain {

        public static void main(String[] args) {

            for (ServicioPeluqueria servicio : ServicioPeluqueria.values()) {
                System.out.println("Nombre: " + servicio.getNombre());
                System.out.println("Descripción: " + servicio.getDescripcion());
                System.out.println("Precio: $" + servicio.getPrecio());
                servicio.mostrarDescripcionServicio();
                System.out.println();
            }
        }
    }
