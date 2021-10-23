package co.btrujillo.modelo.producto.electronico;

import co.btrujillo.modelo.producto.Producto;

abstract public class Electronico extends Producto implements IElectronico {
    private  String fabricante;

    public Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
