public class AnimalEspecifico extends Animal {
    private TipoAnimal tipo;

    public AnimalEspecifico(String nombre, int edad, TipoAnimal tipo) {
        super(nombre, edad);
        this.tipo = tipo;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }
}
