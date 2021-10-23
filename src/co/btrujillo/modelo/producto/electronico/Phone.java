package co.btrujillo.modelo.producto.electronico;

public class Phone extends Electronico {
    private final String modelo ;
    private final Color color;

    public Phone(String fabricante,String modelo, Color color, int precio) {
        super(fabricante,precio);
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio()*1.2;
    }
}
