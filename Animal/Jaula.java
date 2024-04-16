import java.util.ArrayList;
import java.util.List;

public abstract class Jaula {
    protected List<Animal> animales;

    public Jaula() {
        this.animales = new ArrayList<>();
    }

    public abstract void agregarAnimal(Animal animal);

    public void imprimirAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal.getNombre());
        }
    }
}
