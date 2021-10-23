package co.btrujillo.modelo.producto.libro;

import co.btrujillo.modelo.producto.Producto;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(String titulo, String autor, String editorial, int precio  ) {
        super(precio);
        this.fechaPublicacion = new Date();
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta(){
        return getPrecio()*1.50;
    }
}
