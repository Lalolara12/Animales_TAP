public class Main {
    public static void main(String[] args) {
        AnimalEspecifico perro1 = new AnimalEspecifico("Perro Lactozo", 3, TipoAnimal.TERRESTRE);
        AnimalEspecifico perro2 = new AnimalEspecifico("Rex", 5, TipoAnimal.TERRESTRE);
        AnimalEspecifico perro3 = new AnimalEspecifico("Max", 2, TipoAnimal.TERRESTRE);

        AnimalEspecifico pajaro1 = new AnimalEspecifico("Piolín", 1, TipoAnimal.VOLADOR);
        AnimalEspecifico pajaro2 = new AnimalEspecifico("Mordecai", 2, TipoAnimal.VOLADOR);
        AnimalEspecifico pajaro3 = new AnimalEspecifico("Pájaro Loco", 4, TipoAnimal.VOLADOR);

        AnimalEspecifico pez1 = new AnimalEspecifico("Nemo", 1, TipoAnimal.MARINO);
        AnimalEspecifico pez2 = new AnimalEspecifico("Dory", 3, TipoAnimal.MARINO);
        AnimalEspecifico pez3 = new AnimalEspecifico("Pez Globo", 2, TipoAnimal.MARINO);

        Jaula jaula = new Jaula(perro1, pajaro2, pez3);
        jaula.mostrarAnimales();
    }
}
