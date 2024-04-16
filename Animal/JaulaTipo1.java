public class JaulaTipo1 extends Jaula {
    private Class<? extends Animal> tipoAnimal;

    public JaulaTipo1(Class<? extends Animal> tipoAnimal) {
        super();
        this.tipoAnimal = tipoAnimal;
    }

    public void agregarAnimal(Animal animal) {
        if (animal.getClass().equals(tipoAnimal)) {
            animales.add(animal);
        } else {
            System.out.println("Este tipo de jaula solo acepta animales del tipo " + tipoAnimal.getSimpleName());
        }
    }
}
