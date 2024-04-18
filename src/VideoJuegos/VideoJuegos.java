package VideoJuegos;

public enum VideoJuegos implements Juegos{

        DEPORTIVOS("FIFA", "Juego de fútbol donde puedes controlar a tu equipo favorito y competir contra otros", 1993),
        ESTRATEGIA("Age of Empires", "Construye tu imperio y lidera tus ejércitos hacia la victoria", 1997),
        MUSICALES("Guitar Hero", "Demuestra tus habilidades musicales tocando canciones en una guitarra virtual", 2005),
        AVENTURA("The Legend of Zelda", "Embárcate en una épica aventura para rescatar a la princesa Zelda", 1986),
        SIMULACION("The Sims", "Crea y controla a tus propios personajes en un mundo virtual", 2000);

        private final String nombreJuego;
        private final String instruccion;
        private final int anio;


        VideoJuegos(String nombreJuego, String instruccion, int anio) {
            this.nombreJuego = nombreJuego;
            this.instruccion = instruccion;
            this.anio = anio;
        }


        @Override
        public String getNombreJuego() {
            return nombreJuego;
        }

        @Override
        public String getInstruccion() {
            return instruccion;
        }

        @Override
        public int getAnio() {
            return anio;
        }


        public void mostrarPosicionRanking() {
            System.out.println("El juego " + nombreJuego + " está en el top 10 del ranking de ventas.");
        }


        public void comprarMonedas() {
            System.out.println("Compra monedas para desbloquear contenido adicional en " + nombreJuego + ".");
        }
    }

