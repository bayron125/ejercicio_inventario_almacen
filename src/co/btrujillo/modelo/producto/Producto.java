package co.btrujillo.modelo.producto;

abstract public class Producto implements IProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    public int getPrecio(){
        return this.precio;
    }

}
