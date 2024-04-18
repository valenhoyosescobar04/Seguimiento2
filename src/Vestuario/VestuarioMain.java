package Vestuario;

public class VestuarioMain {

    public static void main(String[] args) {

                for (Vestuario prenda : Vestuario.values()) {
                    System.out.println("Nombre: " + prenda.getNombre());
                    System.out.println("Descripción: " + prenda.getDescripcion());
                    System.out.println("Número de estante: " + prenda.getNumeroEstante());
                    prenda.mostrarDescripcionPrenda();
                    System.out.println();
                }
            }
        }

