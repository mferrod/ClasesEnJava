package ClaseSerie;

public class Videojuego {
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public Videojuego() {}

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public int getHorasEstimadas() {
        return this.horasEstimadas;
    }
    public String getGenero() {
        return this.genero;
    }
    public String getCompania() {
        return this.compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }
}
