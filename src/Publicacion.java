public class Publicacion {
    private String titulo;
    private String autor;
   


    public Publicacion(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
       
    }


    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
   
    }


}


