package co.btrujillo.modelo;

import co.btrujillo.modelo.producto.IProducto;
import co.btrujillo.modelo.producto.electronico.*;
import co.btrujillo.modelo.producto.libro.*;
import co.btrujillo.modelo.producto.libro.comics.Comics;

import java.util.Arrays;
import java.util.List;

import static co.btrujillo.modelo.producto.electronico.Color.*;

public class EjercicioInterfaces {
    public static void main(String[] args){

        List<IProducto>productos= Arrays.asList(new Libro("Cien años de soledad","Gabriel Garcia Marquez",
                "la pluma",50000),
                new Comics("The avengers","Stan lee","Marvel", "America Capitan",12000),
                new TvLcd("Samsung",24000000,50),
                new TvLcd("Lg",18000000,48), new TvLcd("Panasonic",12000000,39),
                new Phone("Samsung","a30s",PURPURA,785000),
                new Phone("Xiaomi","redmi 10", ROJO,650000 ));

        System.out.println("Inventario bodega");

        int i =0;
        for (IProducto p: productos){
             i++;
            System.out.println("Item # : "+ i);
            System.out.println("Producto: "+ p.getClass().getSimpleName());
            System.out.println("Precio: $" + p.getPrecio());
            System.out.println("Precio de venta: $"+ p.getPrecioVenta());

            if(p instanceof Electronico){
                System.out.println("Fabricante: " + ((Electronico) p).getFabricante());
                if(p instanceof TvLcd){
                    System.out.println("Pulgadas: "+ ((TvLcd) p).getPulgadas());
                }else if(p instanceof Phone){
                    System.out.println("Modelo: "+ ((Phone) p).getModelo());
                    System.out.println("Color: "+ ((Phone) p).getColor());
                }

            }else if(p instanceof Libro){
                System.out.println("Titulo: "+ ((Libro) p).getTitulo());
                System.out.println("Autor: "+ ((Libro) p).getAutor());
                System.out.println("Editorial: " + ((Libro) p).getEditorial());
                System.out.println("Fecha de Publicacion: " + ((Libro) p).getFechaPublicacion());

                if (p instanceof Comics){
                    System.out.println("Personaje: "+ ((Comics) p).getPersonaje());
                }
            }
            System.out.println();
        }
    }
}
