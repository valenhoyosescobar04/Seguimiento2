package Producto;

public class ProductoMain {

        public static void main(String[] args) {

            for (Producto producto : Producto.values()) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Descripción: " + producto.getDescripcion());
                producto.mostrarUso();
                System.out.println();
            }
        }
    }


