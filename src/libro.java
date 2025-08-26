public class libro extends Publicacion {

    private int paginas;

    public libro(String titulo, String autor,   int paginas) {
        super(titulo,autor , 0);
        this.paginas = paginas;
    }

 

    public int getPaginas() {
        return paginas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Páginas: " + paginas);
    }
}
