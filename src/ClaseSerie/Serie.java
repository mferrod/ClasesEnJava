package ClaseSerie;

public class Serie {
    private String titulo = "";
    private int numTemp = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie() {}

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }
    public Serie(String titulo, int numTemp, String genero, String creador) {
        this.titulo = titulo;
        this.numTemp = numTemp;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public int getNumTemp() {
        return this.numTemp;
    }
    public String getGenero() {
        return this.genero;
    }
    public String getCreador() {
        return this.creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setNumTemp(int numTemp) {
        this.numTemp = numTemp;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "La serie " + titulo + " del director " + creador + " tiene un total de " + numTemp +
                ", el genero de la serie es " + genero + ", su estado de entrega es " + entregado;
    }
}
