public class Reptil extends Animal {
    protected boolean venenoso;

    public Reptil(String nombre, boolean venenoso) {
        super(nombre);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }
}
