package src.peliculas;

import src.tienda.*;

public class VectorPeliculas {

    private Pelicula[] peliculas = new Pelicula[50];
    private int siguientePeli;

    public VectorPeliculas() {
        siguientePeli = 1;
    }

    public void agregarPelicula(String nombrePelicula, int anio, String categoria, boolean disponible) {
        if (siguientePeli > 50) {
            System.out.println("Límite de peliculas alcanzado");
        } else {
            peliculas[(siguientePeli - 1)] = new Pelicula(nombrePelicula, siguientePeli, anio, categoria, disponible);
        }
        siguientePeli++;
    }

    public void agregarPelicula() {
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int anio = IngresoDatos.getEntero("Ingrese el año: ", false);
        String categoria = IngresoDatos.getTexto("Ingrese la categoria");
        agregarPelicula(nombre, anio, categoria, true);
    }

    //mostrar clientes
    public void mostrarPeliculas() {
        System.out.println("\n\n Libros de memorabilia");
        for (int i = 0; i < (siguientePeli - 1); i++) {
            System.out.println("-" + i + ") " + peliculas[i].getInformacionPeli());
        }

        System.out.println("\n\n");
    }

    public void ordenarPeliculas() {
        for (var i = 0; i < siguientePeli; i++) {
            int pos = i;
            Pelicula aux = peliculas[i];
            while ((pos > 0) && (peliculas[pos-1].getNombrePelicula().compareTo(peliculas[i].getNombrePelicula()) > 0 )) {
                peliculas[pos] = peliculas[pos - 1];
                pos--;
            }
            peliculas[pos]=aux;
        }
        
    }

    public void ordenarPorNombrePeliculas(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguientePeli-1); i++) {
            for (int j = 0; j < (siguientePeli-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getNombrePelicula().compareTo(peliculas[j+1].getNombrePelicula()) > 0 );
                else 
                    cambio= (peliculas[j].getNombrePelicula().compareTo(peliculas[j+1].getNombrePelicula()) < 0 );

                if(cambio ){
                    
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }

}