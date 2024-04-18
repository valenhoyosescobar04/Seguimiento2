package VideoJuegos;

public class VideoJuegosMain {

        public static void main(String[] args) {

            for (VideoJuegos juego : VideoJuegos.values()) {
                System.out.println("Nombre del juego: " + juego.getNombreJuego());
                System.out.println("Instrucción: " + juego.getInstruccion());
                System.out.println("Año de creación: " + juego.getAnio());
                juego.mostrarPosicionRanking();
                juego.comprarMonedas();
                System.out.println();
            }
        }
    }
