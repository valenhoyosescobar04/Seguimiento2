package Producto;

public enum Producto {

    LAPIZ("Lápiz", "Instrumento de escritura"),
    CUADERNO("Cuaderno", "Libreta para tomar apuntes"),
    BORRADOR("Borrador", "Instrumento para borrar lápiz o tinta"),
    SACAPUNTA("Sacapuntas", "Herramienta para afilar lápices"),
    CARTUCHERA("Cartuchera", "Estuche para guardar útiles escolares");

    private final String nombre;
    private final String descripcion;


    Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void mostrarUso() {
        System.out.println("El " + nombre + " se utiliza como " + descripcion + ".");
    }
}


