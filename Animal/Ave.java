public class Ave extends Animal {
    protected String tipoPico;

    public Ave(String nombre, String tipoPico) {
        super(nombre);
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }
}
