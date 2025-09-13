package Entidades;

public class ItemVenta {
    private static int contador = 0;
    private final int identificador;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;

    //Constructor
    public ItemVenta(String descripcion, int cantidad, double precioUnitario) {
        this.identificador = contador;
        contador++;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
    public ItemVenta() {
        this.identificador = contador;
        contador++;
    }
    //Setters and Getters
    public int getIdentificador() {
        return this.identificador;
    }
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public  void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Methods
    public double calcularPrecioTotal() {
        return this.precioUnitario * this.cantidad;
    }

    @Override
    public String toString() {
        return  STR."""
                    ItemVenta[id=\{this.getIdentificador()},
                    descripcion=\{this.getDescripcion()},
                    cantidad=\{this.getCantidad()},
                    pUnitario=\{this.getPrecioUnitario()},
                    pTotal=\{this.calcularPrecioTotal()}]

                """;
    }

}
