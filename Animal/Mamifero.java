public class Mamifero extends Animal {
    protected String tipoPelo;

    public Mamifero(String nombre, String tipoPelo) {
        super(nombre);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }
}
