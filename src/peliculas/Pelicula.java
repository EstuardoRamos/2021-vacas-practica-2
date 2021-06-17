package src.peliculas;

public class Pelicula {

    private String nombrePelicula;
    private int idPeli;
    private int anio;
    private String categoria;
    private boolean disponible;

    public Pelicula(String nombrePelicula, int idPeli, int anio, String categoria, boolean disponible) {
        this.nombrePelicula = nombrePelicula;
        this.idPeli = idPeli;
        this.anio = anio;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public Pelicula(String nombrePelicula, int idPeli, boolean disponible) {
        this.nombrePelicula = nombrePelicula;
        this.idPeli = idPeli;
        this.disponible = disponible;
    }

    // getters y seteres
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getIdPeli() {
        return idPeli;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getInformacionPeli() {
        String respuesta = " Id: " + idPeli + "  Nombre Pelicula: " + nombrePelicula+"  Año: "+anio+"  Categoria: "+categoria+"  Disponible: "+disponible;
        return respuesta;
    }

}