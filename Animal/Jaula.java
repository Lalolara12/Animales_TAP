public class Jaula {
    private AnimalEspecifico animal1;
    private AnimalEspecifico animal2;
    private AnimalEspecifico animal3;

    public Jaula(AnimalEspecifico animal1, AnimalEspecifico animal2, AnimalEspecifico animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public void mostrarAnimales() {
        System.out.println("Animales en la jaula:");
        System.out.println(
                "1. Nombre: " + animal1.getNombre() + ", Edad: " + animal1.getEdad() + ", Tipo: " + animal1.getTipo());
        System.out.println(
                "2. Nombre: " + animal2.getNombre() + ", Edad: " + animal2.getEdad() + ", Tipo: " + animal2.getTipo());
        System.out.println(
                "3. Nombre: " + animal3.getNombre() + ", Edad: " + animal3.getEdad() + ", Tipo: " + animal3.getTipo());
    }
}
