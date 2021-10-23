package co.btrujillo.modelo.producto.libro.comics;

import co.btrujillo.modelo.producto.libro.Libro;


public class Comics extends Libro {
    private String personaje;

    public Comics(String titulo, String autor, String editorial,String personaje, int precio  ) {
        super(titulo,autor,editorial,precio);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }
}
