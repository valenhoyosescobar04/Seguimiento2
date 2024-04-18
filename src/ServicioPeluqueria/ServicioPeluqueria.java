package ServicioPeluqueria;

public enum ServicioPeluqueria {

        CORTE("Corte de cabello", "darle un toque de frescura a tu imagen con un corte de cabello a la moda", 20.0),
        UÑAS("Manicura y pedicura", "mantener tus manos y pies en perfecto estado con nuestra manicura y pedicura profesional", 15.0),
        TINTE("Tinte de cabello", "renovar tu apariencia con un toque de color que realce tu cabello y te haga sentir renovada", 30.0);

        private final String nombre;
        private final String descripcion;
        private final double precio;


        ServicioPeluqueria(String nombre, String descripcion, double precio) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
        }


        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public double getPrecio() {
            return precio;
        }


        public void mostrarDescripcionServicio() {
            System.out.println("El servicio de " + nombre + " consiste en " + descripcion + ".");
        }
    }




