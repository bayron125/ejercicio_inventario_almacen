package co.btrujillo.modelo.producto.electronico;



public class TvLcd extends Electronico {
    private int pulgadas;

    public TvLcd(String fabricante, int precio, int pulgadas) {
        super(fabricante, precio);
        this.pulgadas = pulgadas;
    }

    public double getPrecioVenta(){
        return getPrecio() * 1.25;
    }

    public int getPulgadas(){
        return this.pulgadas;
    }

}
